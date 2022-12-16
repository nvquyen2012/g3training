package com.example.demomapstruct;

import lombok.Cleanup;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@SpringBootApplication
public class DemoMapStructApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMapStructApplication.class, args);
    }

}
