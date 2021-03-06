package com.company.souvcoffee.MS.domain.user;

public class WishList {

    public WishList() { }

    private String wid; // pk
    private int wcode;// fk
    private int wpid;//fk

    public WishList(String wid, int wcode, int wpid) {
        this.wid = wid;
        this.wcode = wcode;
        this.wpid = wpid;
    }

    public String getWid() {
        return wid;
    }

    public void setWid(String wid) {
        this.wid = wid;
    }

    public int getWcode() {
        return wcode;
    }

    public void setWcode(int wcode) {
        this.wcode = wcode;
    }

    public int getWpid() {
        return wpid;
    }

    public void setWpid(int wpid) {
        this.wpid = wpid;
    }
}
