package com.Config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// >spring-boot-starter-webflux<  Maven 包
import org.springframework.web.reactive.DispatcherHandler;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import org.springframework.web.server.WebHandler;

//@Configuration
//@ComponentScan
//@EnableWebFlux
public class WebFluxConfig implements WebFluxConfigurer {

//    @Bean
//    public WebHandler webHandler(ApplicationContext applicationContext) {
//        DispatcherHandler dispatcherHandler = new DispatcherHandler(applicationContext);
//        return dispatcherHandler;
//    }

}
