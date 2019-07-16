package com.qf.pojo;

public class Sleave {
    private int lid;
    private int sid;
    private int date;
    private String startDate;
    private String endDate;
    private String reason;
    private int state;

    public Sleave(int lid, int sid, int date, String startDate, String endDate, String reason, int state) {
        this.lid = lid;
        this.sid = sid;
        this.date = date;
        this.startDate = startDate;
        this.endDate = endDate;
        this.reason = reason;
        this.state = state;
    }

    public Sleave() {
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "sleave{" +
                "lid=" + lid +
                ", sid=" + sid +
                ", date=" + date +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", reason='" + reason + '\'' +
                ", state=" + state +
                '}';
    }

}
