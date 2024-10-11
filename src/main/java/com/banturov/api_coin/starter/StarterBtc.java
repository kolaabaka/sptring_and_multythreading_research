package com.banturov.api_coin.starter;

import com.banturov.api_coin.thread.CoinDataGet;
import lombok.RequiredArgsConstructor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RequiredArgsConstructor
public class StarterBtc {

    private final CoinDataGet btcDataGet;

    public void GO(){
        ExecutorService executorBtcService = Executors.newSingleThreadExecutor();
		executorBtcService.submit(btcDataGet);
		executorBtcService.shutdown();
    }
}
