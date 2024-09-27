package com.banturov.api_coin.thread;

import com.banturov.api_coin.dto.CourseDto;
import com.banturov.api_coin.webClient.service.CoinCourseService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

@RequiredArgsConstructor
public class PepeDataGet extends Thread{

    private final CoinCourseService coinService;

    @SneakyThrows
    @Override
    public void run() {
        this.setDaemon(true);
        while(true) {
            Thread.sleep(10);
            CourseDto dto = coinService.getCourseCoint("PEPEUSDT");
            System.out.println(dto);
        }
    }
}
