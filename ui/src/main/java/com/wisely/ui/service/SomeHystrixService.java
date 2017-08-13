package com.wisely.ui.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * 使用Ribbon调用Some Service，并使用断路器
 */
@Service
public class SomeHystrixService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallbackSome")
    public String getSome() {
        return restTemplate.getForObject("http://SOME/getsome", String.class);
    }

    public String fallbackSome() {
        return "some service模块故障";
    }
}
