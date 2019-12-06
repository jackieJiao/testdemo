package com.jiaozhijun.demo;

import com.netflix.discovery.converters.Auto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerService {

    @Autowired
    RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "hellofallback")
    public String hello(){
        return restTemplate.getForEntity("http://HELLOSERVICE/hello",String.class).getBody();
    }

    public String hellofallback(){
        return "errorFromHellofallback";
    }

}
