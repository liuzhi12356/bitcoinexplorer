package com.lz.bitcoinexplorer1109;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@MapperScan("com.lz.bitcoinexplorer1109.dao")
public class Bitcoinexplorer1109Application {

    public static void main(String[] args) {
        SpringApplication.run(Bitcoinexplorer1109Application.class, args);
    }

    @Bean
    public RestTemplate getrestTempldate(){
        return new RestTemplate();
    }
}
