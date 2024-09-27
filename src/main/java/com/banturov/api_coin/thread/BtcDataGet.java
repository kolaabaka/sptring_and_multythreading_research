package com.banturov.api_coin.thread;

import com.banturov.api_coin.webClient.service.CoinCourseService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

@RequiredArgsConstructor
public class BtcDataGet extends Thread{

    private final CoinCourseService coinService;

    @SneakyThrows
    @Override
    public void run() {
        this.setDaemon(true);
        while(true) {
            Thread.sleep(10);
            System.out.println(coinService.getCourseCoint("BTCUSDT"));
        }
    }
}
