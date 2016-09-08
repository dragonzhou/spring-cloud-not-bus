package com.example.service;

import com.alibaba.fastjson.JSON;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


/**
 * Created by lilufeng on 2016/8/29.
 */
@Component
public class ReceiverService {

    @RabbitListener(queues = "queue.foo")
    public void receiveFooQueue(String foo) {
        System.out.println("Received Foo <" + JSON.parseObject(foo).getString("msg") + ">");
    }

    @RabbitListener(queues = "queue.bar")
    public void receiveBarQueue(String bar) {
        System.out.println("Received Bar <" + JSON.parseObject(bar).getString("msg") + ">");
    }
}