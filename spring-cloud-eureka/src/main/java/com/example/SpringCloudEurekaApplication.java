package com.example;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.HashMap;
import java.util.Map;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEurekaApplication implements CommandLineRunner {

	private static Logger logger = LoggerFactory.getLogger(SpringCloudEurekaApplication.class);

	@Autowired
	RabbitMessagingTemplate rabbitMessagingTemplate;

	public static void main(String[] args) {
		logger.debug("######## SpringCloudEureka应用启动开始 ########");
		SpringApplication.run(SpringCloudEurekaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.debug("######## SpringCloudEureka应用启动完成 ########");
//		Map<String,Object> map = new HashMap<String,Object>();
//		map.put("msg","哈哈哈");
//		rabbitMessagingTemplate.convertAndSend("directExchange","queue.foo", JSON.toJSONString(map));
//		map.clear();
//		map.put("msg","呵呵呵");
//		rabbitMessagingTemplate.convertAndSend("directExchange","queue.bar", JSON.toJSONString(map));
	}
}
