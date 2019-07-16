package com.qf.pojo;

public class Tleave {
    private int llid;
    private int tid;
    private String startDate;
    private String endDate;
    private String reason;
    private int state;

    public Tleave() {
    }

    public Tleave(int llid, int tid, String startDate, String endDate, String reason, int state) {
        this.llid = llid;
        this.tid = tid;
        this.startDate = startDate;
        this.endDate = endDate;
        this.reason = reason;
        this.state = state;
    }

    public int getLlid() {
        return llid;
    }

    public void setLlid(int llid) {
        this.llid = llid;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
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
        return "tleave{" +
                "llid=" + llid +
                ", tid=" + tid +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", reason='" + reason + '\'' +
                ", state=" + state +
                '}';
    }
}
