package com.qf.service.impl;

import com.qf.pojo.Sleave;
import com.qf.pojo.Student;
import com.qf.pojo.Weekly;
import com.qf.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    //通过id查询整个学生信息
    @Override
    public Student getStudentBySid(int sid) {

        return null;
    }

    @Override
    public int updateStudent(Student student) {
        return 0;
    }

    @Override
    public int addWeekly(Weekly weekly) {
        return 0;
    }

    @Override
    public int delWeekly(int wid) {
        return 0;
    }

    @Override
    public List<Weekly> getWeeklyListBySid(int sid) {
        return null;
    }

    @Override
    public int addLeave(Sleave sleave) {
        return 0;
    }

    @Override
    public List<Sleave> getSleaveListBySid(int sid) {
        return null;
    }
}
