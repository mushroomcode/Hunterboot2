package com.WebClients;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class GreetingWebClient {

    private WebClient client = WebClient.create("http://localhost:8088");

    private Mono<ClientResponse> res = client.get()
            .uri("/hello").accept(MediaType.TEXT_PLAIN)
            .exchange();

    public String getRes() {
        return ">> result = " + res.flatMap(res ->
                res.bodyToMono(String.class)).block();
    }

}
