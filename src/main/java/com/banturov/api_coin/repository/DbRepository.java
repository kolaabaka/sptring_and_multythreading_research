package com.banturov.api_coin.repository;

import com.banturov.api_coin.dto.CourseDto;
import com.banturov.jooq.tables.Coinname;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.banturov.jooq.tables.Coincourse;

@Repository
@RequiredArgsConstructor
public class DbRepository implements IDbRep{
    @Override
    public void setCourse(CourseDto dto) {

    }

//    @Autowired
//    private DSLContext dsl;
//
//    public void setCourse(CourseDto dto){
//        dsl.update(Coincourse.COINCOURSE)
//            .set(Coincourse.COINCOURSE.COURSE, Integer.valueOf(dto.getPrice()))
//            .where(Coincourse.COINCOURSE.COINID.eq(
//                    dsl.select(Coinname.COINNAME.ID)
//                        .from(Coinname.COINNAME)
//                        .where(Coinname.COINNAME.NAME.eq(dto.getSymbol()))
//                    )
//            );
//    }
}
