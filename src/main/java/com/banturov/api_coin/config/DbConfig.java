package com.banturov.api_coin.config;

import lombok.SneakyThrows;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;

@Configuration
@ConfigurationProperties("spring.datasource")
public class DbConfig {

    private static String url = "jdbc:postgresql://localhost:5432/testBd";
    private static String username = "root";
    private static String password = "root";

    @SneakyThrows
    @Bean
    public static DSLContext getDsl(){
        Connection conn = DriverManager.getConnection(url, username, password);
        return DSL.using(conn, SQLDialect.POSTGRES);
    }
}
