package com.qf.pojo;

public class Teacher {
    private int tid;
    private int uid;
    private String tname;
    private int status;
    private int cid;

    public Teacher(int tid, int uid, String tname, int status, int cid) {
        this.tid = tid;
        this.uid = uid;
        this.tname = tname;
        this.status = status;
        this.cid = cid;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public Teacher() {
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", uid=" + uid +
                ", tname='" + tname + '\'' +
                ", status=" + status +
                ", cid=" + cid +
                '}';
    }
}
