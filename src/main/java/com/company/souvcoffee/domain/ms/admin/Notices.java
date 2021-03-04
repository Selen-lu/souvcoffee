package com.company.souvcoffee.domain.ms.admin;

import java.sql.Date;

public class Notices {
    public Notices() { }

    private int nid;
    private String npw;
    private String nwriter;
    private String ntitle;
    private String ncontext;
    private String nfile;
    private Date nreg;
    private int nhit;

    public Notices(int nid, String npw) {
        this.nid = nid;
        this.npw = npw;
    }

    public Notices(String nwriter, String ntitle, String ncontext, String nfile, Date nreg, int nhit) {
        this.nwriter = nwriter;
        this.ntitle = ntitle;
        this.ncontext = ncontext;
        this.nfile = nfile;
        this.nreg = nreg;
        this.nhit = nhit;
    }

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    public String getNpw() {
        return npw;
    }

    public void setNpw(String npw) {
        this.npw = npw;
    }

    public String getNwriter() {
        return nwriter;
    }

    public void setNwriter(String nwriter) {
        this.nwriter = nwriter;
    }

    public String getNtitle() {
        return ntitle;
    }

    public void setNtitle(String ntitle) {
        this.ntitle = ntitle;
    }

    public String getNcontext() {
        return ncontext;
    }

    public void setNcontext(String ncontext) {
        this.ncontext = ncontext;
    }

    public String getNfile() {
        return nfile;
    }

    public void setNfile(String nfile) {
        this.nfile = nfile;
    }

    public Date getNreg() {
        return nreg;
    }

    public void setNreg(Date nreg) {
        this.nreg = nreg;
    }

    public int getNhit() {
        return nhit;
    }

    public void setNhit(int nhit) {
        this.nhit = nhit;
    }
}
