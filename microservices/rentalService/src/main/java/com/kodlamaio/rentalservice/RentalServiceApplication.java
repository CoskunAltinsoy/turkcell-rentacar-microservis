package com.kodlamaio.rentalservice;

import com.kodlamaio.commonpackage.utils.constants.Paths;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients

@SpringBootApplication(scanBasePackages = {Paths.ConfigurationBasePackage, Paths.Rental.ServisBasePackage})
public class RentalServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RentalServiceApplication.class, args);
    }

}