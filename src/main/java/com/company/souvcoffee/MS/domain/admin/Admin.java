package com.company.souvcoffee.MS.domain.admin;

public class Admin {
    public Admin() {}
    private String aid;
    private String apw;
    private String aname;
    private byte  alevel;
    private String  areg;

    public Admin(String aid, String apw, String aname, byte alevel, String areg) {
        this.aid = aid;
        this.apw = apw;
        this.aname = aname;
        this.alevel = alevel;
        this.areg = areg;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getApw() {
        return apw;
    }

    public void setApw(String apw) {
        this.apw = apw;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public byte getAlevel() {
        return alevel;
    }

    public void setAlevel(byte alevel) {
        this.alevel = alevel;
    }

    public String getAreg() {
        return areg;
    }

    public void setAreg(String areg) {
        this.areg = areg;
    }
}
