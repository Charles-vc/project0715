package com.qf.pojo;

public class StudentClass {
    private int cid;
    private String cname;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public StudentClass() {
    }

    public StudentClass(int cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                '}';
    }
}
