package com.qf.mapper;

import com.qf.pojo.Sleave;
import com.qf.pojo.Student;
import com.qf.pojo.Tleave;
import com.qf.pojo.Weekly;

import java.util.List;

public interface TeacherMapper {
    //通过关联teacher，class，student，weekly查询到周报
    //查询本班学生考试周报成绩
    List<Weekly> getWeeklyListBySid(int tid);
    //讲师打分周报
    int updateWeeklyByTid(int tid,int score);
    //查看本班内学生信息
    List<Student> getStudentByTid(int tid);
    //查看待审核的学生请假信息
    List<Sleave> getSleaveListByTid(int tid);
    //审核学生请假
    int updateLeave(int lid);
    //老师请假
    int addTleave(Tleave tleave);

}
