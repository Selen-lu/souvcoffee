package com.company.souvcoffee.MS.domain;

import java.sql.Date;

public class Ques {

    public Ques() { }

    private int quid;
    private int qucate;
    private String quwriter;
    private String qupw;
    private String qutitle;
    private String qucontext;
    private String qufile;
    private Date qureg;
    private byte qusecu;
    private int quhit;
    private int qupid;
    private String qunum;

    public Ques(int quid, int qucate, String quwriter, String qupw) {
        this.quid = quid;
        this.qucate = qucate;
        this.quwriter = quwriter;
        this.qupw = qupw;
    }

    public Ques(String qutitle, String qucontext, String qufile, Date qureg) {
        this.qutitle = qutitle;
        this.qucontext = qucontext;
        this.qufile = qufile;
        this.qureg = qureg;
    }

    public Ques(byte qusecu, int quhit, int qupid, String qunum) {
        this.qusecu = qusecu;
        this.quhit = quhit;
        this.qupid = qupid;
        this.qunum = qunum;
    }

    public int getQuid() {
        return quid;
    }

    public void setQuid(int quid) {
        this.quid = quid;
    }

    public int getQucate() {
        return qucate;
    }

    public void setQucate(int qucate) {
        this.qucate = qucate;
    }

    public String getQuwriter() {
        return quwriter;
    }

    public void setQuwriter(String quwriter) {
        this.quwriter = quwriter;
    }

    public String getQupw() {
        return qupw;
    }

    public void setQupw(String qupw) {
        this.qupw = qupw;
    }

    public String getQutitle() {
        return qutitle;
    }

    public void setQutitle(String qutitle) {
        this.qutitle = qutitle;
    }

    public String getQucontext() {
        return qucontext;
    }

    public void setQucontext(String qucontext) {
        this.qucontext = qucontext;
    }

    public String getQufile() {
        return qufile;
    }

    public void setQufile(String qufile) {
        this.qufile = qufile;
    }

    public Date getQureg() {
        return qureg;
    }

    public void setQureg(Date qureg) {
        this.qureg = qureg;
    }

    public byte getQusecu() {
        return qusecu;
    }

    public void setQusecu(byte qusecu) {
        this.qusecu = qusecu;
    }

    public int getQuhit() {
        return quhit;
    }

    public void setQuhit(int quhit) {
        this.quhit = quhit;
    }

    public int getQupid() {
        return qupid;
    }

    public void setQupid(int qupid) {
        this.qupid = qupid;
    }

    public String getQunum() {
        return qunum;
    }

    public void setQunum(String qunum) {
        this.qunum = qunum;
    }
}
