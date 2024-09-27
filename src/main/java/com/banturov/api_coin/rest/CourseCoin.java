package com.banturov.api_coin.rest;

import com.banturov.api_coin.dto.CourseDto;
import com.banturov.api_coin.thread.BtcDataGet;
import com.banturov.api_coin.webClient.service.CoinCourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class CourseCoin {

    private final CoinCourseService coinService;

    private final BtcDataGet dataGet;

    @GetMapping(value = "/btc")
    public CourseDto getCourseBtc(){
        return coinService.getCourseCoint("BTCUSDT");
    }

    @GetMapping(value = "/pepe")
    public CourseDto getCoursePepe(){
        return coinService.getCourseCoint("PEPEUSDT");
    }

    @GetMapping(value = "/eth")
    public CourseDto getCourseEth(){
        return coinService.getCourseCoint("ETHUSDT");
    }

}
