package com.example.demo.resource;


import org.apache.catalina.connector.Response;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;




        @RestController
        @RequestMapping("")
            public    class Hello {

            @GetMapping("")
                    public ResponseEntity<String> helloworld(){
                String message = "Hello Alaa" ;
                return ResponseEntity.ok(message);


            }

        }














