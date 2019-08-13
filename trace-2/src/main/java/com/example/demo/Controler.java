package com.example.demo;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {
    private final Logger logger = Logger.getLogger(getClass());

    @RequestMapping(value = "/trace-2", method = RequestMethod.GET)
    public String trace() {
        System.out.println("===<call trace-2>===");
        return "Trace   Test";
    }
}
