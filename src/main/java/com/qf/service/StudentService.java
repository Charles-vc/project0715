package com.qf.service;

import com.qf.pojo.Sleave;
import com.qf.pojo.Student;
import com.qf.pojo.Weekly;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StudentService {
    //通过id查询整个学生信息
    Student getStudentBySid(int sid);
    //通过id更改学生信息
    int updateStudent(Student student);
    //增加周报
    int addWeekly(Weekly weekly);
    //删除周报
    int delWeekly(int wid);
    //查询自己周报
    List<Weekly> getWeeklyListBySid(int sid);
    //添加请假
    int addLeave(Sleave sleave);
    //查看请假
    List<Sleave> getSleaveListBySid(int sid);
}
