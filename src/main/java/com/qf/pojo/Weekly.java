package com.qf.pojo;

public class Weekly {
    private int wid;
    private int sid;
    private String title;
    private int wtime;
    private String context;
    private int score;

    public Weekly(int wid, int sid, String title, int time, String context, int score) {
        this.wid = wid;
        this.sid = sid;
        this.title = title;
        this.wtime = wtime;
        this.context = context;
        this.score = score;
    }

    public Weekly() {
    }

    @Override
    public String toString() {
        return "Weekly{" +
                "wid=" + wid +
                ", sid=" + sid +
                ", title='" + title + '\'' +
                ", time=" + wtime +
                ", context='" + context + '\'' +
                ", score=" + score +
                '}';
    }

    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTime() {
        return wtime;
    }

    public void setTime(int time) {
        this.wtime = time;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
