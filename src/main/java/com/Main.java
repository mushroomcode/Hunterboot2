package com;

import com.WebClients.GreetingWebClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
//        GreetingWebClient greetingWebClient = new GreetingWebClient();
//        System.out.println(greetingWebClient.getRes());

    }
}
