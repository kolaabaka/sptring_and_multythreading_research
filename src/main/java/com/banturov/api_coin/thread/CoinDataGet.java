package com.banturov.api_coin.thread;

import com.banturov.api_coin.dto.CourseDto;
import com.banturov.api_coin.webClient.service.CoinCourseService;
import com.banturov.jooq.tables.Coincourse;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.jooq.DSLContext;

@RequiredArgsConstructor
public class CoinDataGet extends Thread{

    private final CoinCourseService coinService;

    private final String coinName;

    private final int coinId;

    private final DSLContext dsl;

    @SneakyThrows
    @Override
    public void run() {
        this.setDaemon(true);
        CourseDto dto = new CourseDto();

        while(true) {
            dto = coinService.getCourseCoint(coinName);
            Thread.sleep(10);
            System.out.println(coinService.getCourseCoint(coinName));

            try {
                dsl.insertInto(com.banturov.jooq.tables.Coincourse.COINCOURSE)
                    .set(Coincourse.COINCOURSE.COINID, coinId)
                    .set(Coincourse.COINCOURSE.COURSE, dto.getPrice())
                    .execute();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
