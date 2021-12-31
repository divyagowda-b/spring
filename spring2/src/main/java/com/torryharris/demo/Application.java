package com.torryharris.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    private static final Logger LOG = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
//		System.out.println("Start"); // Not applicable
        LOG.info("Start");
        SpringApplication.run(Application.class, args);
        LOG.info("End");
    }
}
