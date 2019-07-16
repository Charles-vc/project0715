package com.qf.pojo;

public class Student {
    private int sid;
    private int uid;
    private String sname;
    private int age;
    private int cid;
    private int grade;

    public Student(int sid, int uid, String sname, int age, int cid, int grade) {
        this.sid = sid;
        this.uid = uid;
        this.sname = sname;
        this.age = age;
        this.cid = cid;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", uid=" + uid +
                ", sname='" + sname + '\'' +
                ", age=" + age +
                ", cid=" + cid +
                ", grade=" + grade +
                '}';
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Student() {
    }
}
