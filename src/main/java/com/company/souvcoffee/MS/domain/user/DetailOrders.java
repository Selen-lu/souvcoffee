package com.company.souvcoffee.MS.domain.user;

public class DetailOrders {
    public DetailOrders() { }

    private int  deid;
    private int  decount;
    private int deusid;
    private int depid;


    public DetailOrders(int deid, int decount, int deusid, int depid) {
        this.deid = deid;
        this.decount = decount;
        this.deusid = deusid;
        this.depid = depid;
    }

    public int getDeid() {
        return deid;
    }

    public void setDeid(int deid) {
        this.deid = deid;
    }

    public int getDecount() {
        return decount;
    }

    public void setDecount(int decount) {
        this.decount = decount;
    }

    public int getDeusid() {
        return deusid;
    }

    public void setDeusid(int deusid) {
        this.deusid = deusid;
    }

    public int getDepid() {
        return depid;
    }

    public void setDepid(int depid) {
        this.depid = depid;
    }
}
