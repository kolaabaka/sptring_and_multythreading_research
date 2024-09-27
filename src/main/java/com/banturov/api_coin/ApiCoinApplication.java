package com.banturov.api_coin;

import java.nio.*;
import com.banturov.api_coin.config.SpringConfig;
import com.banturov.api_coin.starter.Starter;
import com.banturov.api_coin.thread.BtcDataGet;
import com.banturov.api_coin.thread.EthDataGet;
import com.banturov.api_coin.thread.PepeDataGet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableTransactionManagement
public class ApiCoinApplication {

    public static void main(String[] args) {
		SpringApplication.run(ApiCoinApplication.class, args);

		Starter starter = SpringConfig.getStarter();

		starter.GO();

//		BtcDataGet dataBtcGet = SpringConfig.getBtcDataGet();
//		EthDataGet dataEthGet = SpringConfig.getEthDataGet();
//		PepeDataGet dataPepeGet = SpringConfig.getPepeDataGet();
		//BTC
//		ExecutorService executorBtcService = Executors.newFixedThreadPool(1);
//		executorBtcService.submit(dataBtcGet);
//		executorBtcService.shutdown();
		//ETH
//		ExecutorService executorEthService = Executors.newFixedThreadPool(1);
//		executorEthService.submit(dataEthGet);
//		executorEthService.shutdown();
		//PEPE
//		ExecutorService executorPepeService = Executors.newFixedThreadPool(1);
//		executorPepeService.submit(dataPepeGet);
//		executorPepeService.shutdown();
	}

}
