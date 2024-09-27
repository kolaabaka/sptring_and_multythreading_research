package com.banturov.api_coin.webClient.service;

import com.banturov.api_coin.dto.CourseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.logging.Logger;

@Service
@RequiredArgsConstructor
public class CoinCourseService {
    private final WebClient web;
    private final Logger log;

    public CourseDto getCourseCoint(String coin){
        return web.get()
            .uri("https://api.binance.com/api/v3/ticker/price?symbol=" + coin)
            .retrieve()
            .bodyToMono(CourseDto.class)
            .doOnError(error -> log.info(error.getMessage()))
            .block();
    }

}
