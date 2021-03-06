package com.zoo.stockweb;

import com.zoo.stockcommon.domain.Stock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.zoo.stockcommon.repository.StockRepository;

@SpringBootApplication
@EntityScan(basePackageClasses = {Stock.class})
@EnableJpaRepositories(basePackageClasses = {StockRepository.class})
//@EnableJpaRepositories(basePackages = "com.zoo.stockcommon")
//@EntityScan(basePackages = "com.zoo.stockcommon")
//@ComponentScan(basePackages = "com.zoo.stockcommon")
public class StockWebApplication {
    public static void main(String[] args) { SpringApplication.run(StockWebApplication.class, args);

    }
}
