package com.banturov.api_coin;

import java.nio.*;
import com.banturov.api_coin.config.SpringConfig;
import com.banturov.api_coin.starter.StarterBtc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, R2dbcAutoConfiguration.class})
@EnableTransactionManagement
public class ApiCoinApplication {

    public static void main(String[] args) {
		SpringApplication.run(ApiCoinApplication.class, args);

		StarterBtc starter = SpringConfig.getBtcStarter();

		starter.GO();

	}

}
