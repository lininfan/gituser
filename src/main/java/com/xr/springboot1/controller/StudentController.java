package com.xr.springboot1.controller;

import com.google.gson.Gson;
import com.xr.springboot1.model.Student;
import com.xr.springboot1.servlect.StudentServlect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentServlect studentServlect;

    @RequestMapping("/hello")
    public  String sel(HttpServletRequest request){
        System.out.println("进入sel方法");
        List<Student> sel = studentServlect.sel();
        request.setAttribute("sel",sel);
       return "index1";
    }

    @RequestMapping("/selid/{sid}")
    public List<Student> selid(HttpServletRequest request, @PathVariable("sid")Integer sid){
        System.out.println("进入sel方法");
        List<Student> sel = studentServlect.selid(sid);
       /* request.setAttribute("sel",sel);
        Gson gson = new Gson();
        return gson.toJson(sel);*/
       return sel;
    }
}
