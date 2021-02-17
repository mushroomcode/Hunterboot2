package com.Controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@RestController
public class FluxController {

    @GetMapping("/open")
    public Mono<String> getResult() {
//        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
//                .body(BodyInserters.fromValue("oh,hello sir!"));
        return Mono.just("耐得住寂寞的是英雄!");

    }

}
