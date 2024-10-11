package com.banturov.api_coin.repository;

import com.banturov.api_coin.dto.CourseDto;
import org.jooq.DSLContext;

public interface IDbRep {

    void setCourse(DSLContext dsl, CourseDto dto);
}
