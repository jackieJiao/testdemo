package com.example.sleuth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class Sleuth2Application {

	public static void main(String[] args) {
		SpringApplication.run(Sleuth2Application.class, args);
	}

	@GetMapping("/trace2")
    public String trace2(){
	    return "Trace2";
    }

}
