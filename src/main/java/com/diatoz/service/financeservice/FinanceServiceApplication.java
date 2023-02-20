package com.diatoz.service.financeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(scanBasePackages = {"com.diatoz.service.financeservice"})
@ComponentScan

public class FinanceServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(FinanceServiceApplication.class, args);

    }


}
