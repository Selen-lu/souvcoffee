package com.company.souvcoffee.domain.ms;

import java.sql.Date;

public class Coupons {
    public Coupons() {}
   private String cuid;
    private String cuname;
    private int cudiscount;
    private int  cuprice;
    private Date cubirth;
    private Date custart;
    private Date cuend;
    private int cucode;
    private int cupid;

    public Coupons(String cuid, String cuname, int cudiscount, int cuprice) {
        this.cuid = cuid;
        this.cuname = cuname;
        this.cudiscount = cudiscount;
        this.cuprice = cuprice;
    }

    public Coupons(Date cubirth, Date custart, Date cuend, int cucode, int cupid) {
        this.cubirth = cubirth;
        this.custart = custart;
        this.cuend = cuend;
        this.cucode = cucode;
        this.cupid = cupid;
    }

    public String getCuid() {
        return cuid;
    }

    public void setCuid(String cuid) {
        this.cuid = cuid;
    }

    public String getCuname() {
        return cuname;
    }

    public void setCuname(String cuname) {
        this.cuname = cuname;
    }

    public int getCudiscount() {
        return cudiscount;
    }

    public void setCudiscount(int cudiscount) {
        this.cudiscount = cudiscount;
    }

    public int getCuprice() {
        return cuprice;
    }

    public void setCuprice(int cuprice) {
        this.cuprice = cuprice;
    }

    public Date getCubirth() {
        return cubirth;
    }

    public void setCubirth(Date cubirth) {
        this.cubirth = cubirth;
    }

    public Date getCustart() {
        return custart;
    }

    public void setCustart(Date custart) {
        this.custart = custart;
    }

    public Date getCuend() {
        return cuend;
    }

    public void setCuend(Date cuend) {
        this.cuend = cuend;
    }

    public int getCucode() {
        return cucode;
    }

    public void setCucode(int cucode) {
        this.cucode = cucode;
    }

    public int getCupid() {
        return cupid;
    }

    public void setCupid(int cupid) {
        this.cupid = cupid;
    }
}
