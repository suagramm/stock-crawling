package com.zoo.stockbatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing
@SpringBootApplication
public class StockBatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockBatchApplication.class, args);
    }

}

