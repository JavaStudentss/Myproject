package com.example.demo.Mapper;

import com.example.demo.entiy.student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * studentMapper
 * com.example.demo.Mapper
 *
 * @author wang
 * @date 2023/6/15 19:47
 */
@Mapper
public interface studentMapper {
    @Select("select * from student where id= #{id}")
    student findStudentByld(@Param("id") String id);
    @Select("select * from student where dept=#{deptName}")
    List<student> searchStudentByDept(@Param("depeName") String deptName);
    @Insert("insert into student(id,stu_no,stu_name,stu_age,stu_dept,source_code)" +
            " value(#{id},#{stuNo},#{stuName},#{stuAge},#{stuDept},#{sourceCode})")
    boolean addStudent(student student);
}
