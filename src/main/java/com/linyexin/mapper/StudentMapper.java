package com.linyexin.mapper;

import com.linyexin.model.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentMapper {
    int deleteByPrimaryKey(String sno);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(String sno);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}