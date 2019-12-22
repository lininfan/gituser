package com.xr.springboot1.dao;

import com.xr.springboot1.model.Student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentMapper {
    @Select("select * from student")
    List<Student> sel();

    @Select("select * from student where sid=#{sid}")
    List<Student> selid(@Param("sid") Integer sid);

}
