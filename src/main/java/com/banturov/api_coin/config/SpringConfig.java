package com.banturov.api_coin.config;

import com.banturov.api_coin.dto.CourseDto;
import com.banturov.api_coin.repository.IDbRep;
import com.banturov.api_coin.starter.StarterBtc;
import com.banturov.api_coin.thread.CoinDataGet;
import com.banturov.api_coin.webClient.service.CoinCourseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.logging.Logger;

@Configuration
public class SpringConfig {

    @Bean
    public static StarterBtc getBtcStarter(){
        return new StarterBtc(SpringConfig.getBtcDataGet());
    }

    @Bean
    public static CoinDataGet getBtcDataGet(){
        return new CoinDataGet(new CoinCourseService(webClientFactory(), getLog()),"BTCUSDT",1, DbConfig.getDsl());
    }

    @Bean
    public static Logger getLog() {
        return Logger.getLogger(SpringConfig.class.getName());
    }

    @Bean
    public static WebClient webClientFactory(){
        return WebClient.builder()
            .build();
    }

}
