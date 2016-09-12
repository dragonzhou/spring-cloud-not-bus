package com.example.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by lilufeng on 2016/8/25.
 */
@Service
public class ConsumerService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String addService() {
    	System.err.println("sys-consumer-c 调用");
        return restTemplate.getForEntity("http://sys-service-c/add?a=10&b=20", String.class).getBody();
    }

    public String addServiceFallback() {
    	System.err.println("sys-consumer-a 调用");
        return restTemplate.getForEntity("http://sys-service-a/add?a=10&b=20", String.class).getBody();
    }
}
