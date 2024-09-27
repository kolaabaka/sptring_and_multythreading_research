package com.banturov.api_coin.thread;

import com.banturov.api_coin.dto.CourseDto;
import com.banturov.api_coin.webClient.service.CoinCourseService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;

@RequiredArgsConstructor
public class EthDataGet extends Thread{

    private final CoinCourseService coinService;

    @SneakyThrows
    @Override
    public void run() {
        this.setDaemon(true);
        while(true) {
            Thread.sleep(10);
            CourseDto dto = coinService.getCourseCoint("ETHUSDT");
            System.out.println(dto);
        }
    }
}
