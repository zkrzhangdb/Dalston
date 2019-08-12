package com.example.demo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DcController {

    @Autowired
    RestTemplate restTemplate;


    private final Logger logger = Logger.getLogger(getClass());

    @RequestMapping(value = "/trace-1", method = RequestMethod.GET)
    public String trace() {
        logger.info("===call trace-1===");
        return restTemplate.getForEntity("http://trace-2/trace-2", String.class).getBody();
    }




}