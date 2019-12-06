package com.jiaozhijun.feignconsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("helloservice")
public interface HelloService {



    @RequestMapping("/hello")
    String hello();
}
