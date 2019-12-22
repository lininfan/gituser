package com.xr.springboot1.servlect.servlectImpl;

import com.xr.springboot1.dao.StudentMapper;
import com.xr.springboot1.model.Student;
import com.xr.springboot1.servlect.StudentServlect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServlectImpl implements StudentServlect {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> sel() {
        return studentMapper.sel();
    }

    @Override
    public List<Student> selid(Integer sid) {
        return studentMapper.selid(sid);
    }
}
