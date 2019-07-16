package com.qf.service.impl;

import com.qf.mapper.TeacherMapper;
import com.qf.pojo.*;
import com.qf.service.TeacherService;
import org.activiti.engine.HistoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.task.Task;
import org.activiti.engine.task.TaskQuery;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeacherServiceImpl implements TeacherService {
   @Autowired
   private TeacherMapper teacherMapper;
    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private TaskService taskService;
    @Autowired
    private HistoryService historyService;
    //通过关联teacher，class，student，weekly查询到周报
    //查询本班学生考试周报成绩
    @Override
    public List<Weekly> getWeeklyListBySid(int tid) {
        List<Weekly> listBySid = teacherMapper.getWeeklyListBySid(tid);
        return listBySid;
    }
    //讲师打分周报
    @Override
    public int updateWeeklyByTid(int tid, int score) {
        int i = teacherMapper.updateWeeklyByTid(tid, score);
        return i;
    }
    //查看本班内学生信息
    @Override
    public List<Student> getStudentByTid(int tid) {
        List<Student> studentList = teacherMapper.getStudentByTid(tid);
        return studentList;
    }
    //查看待审核的学生请假信息
    @Override
    public List<Sleave> getSleaveListByTid(int tid) {

        List<Sleave> listByTid = teacherMapper.getSleaveListByTid(tid);
        return listByTid;
    }
    //审核学生请假
    @Override
    public int updateLeave(int lid) {
        String taskId = taskService.createTaskQuery().processInstanceBusinessKey(lid+"").singleResult().getId();
        taskService.complete(taskId);

        return teacherMapper.updateLeave(lid);
    }
    //老师请假
    @Override
    public int addTleave(Tleave tleave,int sid) {

        teacherMapper.addTleave(tleave);
        int lid = tleave.getLlid();
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("teacher",teacherMapper.getHeaderBySid(sid).getTname());
        map.put("boss","laowang");
        runtimeService.startProcessInstanceByKey("leave",lid+"",map);
        String taskId = taskService.createTaskQuery().taskAssignee(teacherMapper.getHeaderBySid(sid).getTname()).singleResult().getId();
        taskService.complete(taskId);

        return lid;
    }
    //sid得到班主任和讲师
    @Override
    public Teacher getHeaderBySid(int sid) {
        Teacher headerteacher = teacherMapper.getHeaderBySid(sid);
        return headerteacher;
    }

    @Override
    public Teacher getTeacherBySid(int sid) {
        Teacher teacher = teacherMapper.getTeacherBySid(sid);
        return teacher;
    }
}
