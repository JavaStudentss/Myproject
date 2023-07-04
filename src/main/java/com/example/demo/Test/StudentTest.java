package com.example.demo.Test;

import com.example.demo.Mapper.studentMapper;
import com.example.demo.entiy.student;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * StudentTest
 * com.example.demo.Test
 *
 * @author wang
 * @date 2023/6/15 21:14
 */

public class StudentTest {
    @Autowired
    private studentMapper st;
    @Test
    public void test(){
        st.findStudentByld("1");
        st.searchStudentByDept("软件工程学院");
        st.addStudent(new student());
    }
}
