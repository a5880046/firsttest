package com.linyexin.controller;

import com.linyexin.mapper.StudentMapper;
import com.linyexin.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/student")
public class StudentController {

    private static Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public String selectStudent(@RequestParam("sno") String sno) {
        System.out.println(sno);
        Student student = studentMapper.selectByPrimaryKey(sno);
        logger.info(student.getSname());
        return "123";
    }
}
