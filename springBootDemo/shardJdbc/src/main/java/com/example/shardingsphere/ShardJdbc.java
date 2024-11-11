package com.example.shardingsphere;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Hemant
 * @date 2024/11/07
 **/
@SpringBootApplication(scanBasePackages = {"com.example.shardingsphere**"})
public class ShardJdbc {
    public static void main(String[] args) {
        SpringApplication.run(ShardJdbc.class, args);
    }
}