package com.example.ReactSpringApp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class AIController {

    @Value("${openai.api.key}")
    private String apiKey;

    @PostMapping("/askai")
    public String askAI(@RequestBody Map<String,String> body){

        String symptoms = body.get("message");

        String prompt =
                "You are a healthcare assistant. " +
                        "Suggest possible disease and doctor specialization for symptoms: "
                        + symptoms;

        WebClient client = WebClient.builder()
                .baseUrl("https://api.openai.com/v1/chat/completions")
                .defaultHeader(HttpHeaders.AUTHORIZATION,"Bearer " + apiKey)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();

        Map<String,Object> requestBody = Map.of(
                "model","gpt-3.5-turbo",
                "messages", List.of(
                        Map.of(
                                "role","user",
                                "content",prompt
                        )
                )
        );

        String response = client.post()
                .bodyValue(requestBody)
                .retrieve()
                .bodyToMono(String.class)
                .block();

        System.out.println(response);

        return response;
    }
}