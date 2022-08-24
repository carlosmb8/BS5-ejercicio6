package com.example.bs5ejercicio6;

import jdk.jfr.Threshold;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Bs5Ejercicio6Application {

    public static void main(String[] args) {
        SpringApplication.run(Bs5Ejercicio6Application.class, args);

        log.trace("hola desde mi logger trace ");
        log.debug("hola desde mi logger debug");
        log.info("hola desde mi logger info");
        log.warn("hola desde mi logger warning");
        log.error("hola desde mi logger error");
//        log.fatal("hola desde mi logger ");

        System.out.println("*************************");

    }


}
