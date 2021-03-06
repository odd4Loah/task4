package com.lihoo.ssm.gai.service;

import com.lihoo.ssm.gai.model.Student;
import com.lihoo.ssm.gai.util.Page;

import java.util.List;

public interface StudentService {

    //查询学生列表
    List<Student> findStudentList() throws Exception;

    //通过id 查找学生
    Student findStudentById(long id) throws Exception;

    //通过姓名查找学生
    Student findStudentByName(String username) throws Exception;

    //增加学生  接口
    void addStudent(Student student) throws Exception;

    //删除学生信息  接口
    void deleteStudent(Student student) throws Exception;

    //修改学生信息  接口
    void updateStudent(Student student) throws Exception;

}
