package com.banturov.api_coin.config;

import com.banturov.api_coin.repository.IDbRep;
import com.banturov.api_coin.starter.Starter;
import com.banturov.api_coin.thread.BtcDataGet;
import com.banturov.api_coin.thread.EthDataGet;
import com.banturov.api_coin.thread.PepeDataGet;
import com.banturov.api_coin.webClient.service.CoinCourseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.logging.Logger;

@Configuration
public class SpringConfig {

    @Bean
    public static Starter getStarter(){
        return new Starter(SpringConfig.getBtcDataGet());
    }

    @Bean
    public static BtcDataGet getBtcDataGet(){
        return new BtcDataGet(new CoinCourseService(webClientFactory(), getLog()));
    }

    @Bean
    public static EthDataGet getEthDataGet(){
        return new EthDataGet(new CoinCourseService(webClientFactory(), getLog()));
    }

    @Bean
    public static PepeDataGet getPepeDataGet(){
        return new PepeDataGet(new CoinCourseService(webClientFactory(), getLog()));
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
