package com.Route;

import com.Handles.GreetingHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.*;

@Configuration
public class HunterRoutes {

    @Bean
    public RouterFunction<ServerResponse> route(GreetingHandler greetingHandler) {
        return RouterFunctions
                .route(RequestPredicates.GET("/hello")
                        .and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), greetingHandler::hello);

//        return RouterFunctions.route(RequestPredicates.GET("/hello"),
//                serverRequest -> ServerResponse
//                        .ok()
//                        .contentType(MediaType.TEXT_PLAIN)
//                        .body(BodyInserters.fromValue("oh,hello sir!")));

    }

}
