package com.jiaozhijun.feignconsumer;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    HelloService helloService;

    @GetMapping("/feign-consumer")
    public String helloconsumer(){
        System.out.println("feign from browser");
        return helloService.hello();
    }

}
