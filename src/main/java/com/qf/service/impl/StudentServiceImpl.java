package com.qf.service.impl;

import com.qf.mapper.StudentMapper;
import com.qf.mapper.TeacherMapper;
import com.qf.pojo.Sleave;
import com.qf.pojo.Student;
import com.qf.pojo.Weekly;
import com.qf.service.StudentService;
import org.activiti.engine.HistoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private TaskService taskService;
    @Autowired
    private HistoryService historyService;
    @Autowired
    private TeacherMapper teacherMapper;
    //通过id查询整个学生信息
    @Override
    public Student getStudentBySid(int sid) {

        Student student = studentMapper.getStudentBySid(sid);
        return student;
    }
    //通过id更改学生信息
    @Override
    public int updateStudent(Student student) {
        int i = studentMapper.updateStudent(student);
        return i;
    }
    //增加周报
    @Override
    public int addWeekly(Weekly weekly) {
        int i = studentMapper.addWeekly(weekly);
        return i;
    }
    //删除周报
    @Override
    public int delWeekly(int wid) {
        int i = studentMapper.delWeekly(wid);
        return i;
    }
    //查询自己周报
    @Override
    public List<Weekly> getWeeklyListBySid(int sid) {
        List<Weekly> weeklyList = studentMapper.getWeeklyListBySid(sid);
        return weeklyList;
    }
    //添加请假
    @Override
    public int addLeave(Sleave sleave,int sid) {
            studentMapper.addLeave(sleave);
            int lid = sleave.getLid();
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("student",studentMapper.getStudentBySid(sid).getSname());
            map.put("teacher",teacherMapper.getTeacherBySid(sid).getTname());
            map.put("head",teacherMapper.getHeaderBySid(sid).getTname());
            map.put("boss","laowang");
            map.put("day",sleave.getDate());
            runtimeService.startProcessInstanceByKey("leave1",lid+"",map);
            String taskId = taskService.createTaskQuery().taskAssignee(teacherMapper.getHeaderBySid(sid).getTname()).singleResult().getId();
            taskService.complete(taskId);

            return lid;
        }
    //查看请假
    @Override
    public List<Sleave> getSleaveListBySid(int sid) {
        List<Sleave> sleaveListBySid = studentMapper.getSleaveListBySid(sid);
        return sleaveListBySid;

    }
}
