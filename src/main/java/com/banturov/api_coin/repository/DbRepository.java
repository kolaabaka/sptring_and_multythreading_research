package com.banturov.api_coin.repository;

import com.banturov.api_coin.dto.CourseDto;
import com.banturov.jooq.tables.Coinname;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;
import com.banturov.jooq.tables.Coincourse;

@Repository
@RequiredArgsConstructor
public class DbRepository implements IDbRep{

    public void setCourse(DSLContext dsl, CourseDto dto){
        dsl.update(Coincourse.COINCOURSE)
            .set(Coincourse.COINCOURSE.COURSE, dto.getPrice())
            .where(Coincourse.COINCOURSE.COINID.eq(
                    dsl.select(Coinname.COINNAME.ID)
                        .from(Coinname.COINNAME)
                        .where(Coinname.COINNAME.NAME.eq(dto.getSymbol()))
                    )
            ).execute();
    }
}
