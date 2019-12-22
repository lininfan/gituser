package com.xr.springboot1.servlect;

import com.xr.springboot1.model.Student;
import org.springframework.data.relational.core.sql.In;

import java.util.List;

public interface StudentServlect {
   public List<Student> sel();

   public List<Student> selid(Integer sid);
}
