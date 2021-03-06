package com.company.souvcoffee.MS.domain;

import java.sql.Date;

public class Orders {
    public Orders() { }


    private int  ordid;//pk
    private Date orddate;
    private String ordname;
    private String ordphone;
    private int  ordpost;
    private String ordaddr;
    private  int ordpoint;
    private String   ordcoupons;
    private int orddeliver;
    private int ordamount;
    private int  ordpay;
    private int  ordinvoice;
    private int ordcode;  // fk

    public Orders(int ordid, Date orddate, String ordname, String ordphone, int ordpost, String ordaddr) {
        this.ordid = ordid;
        this.orddate = orddate;
        this.ordname = ordname;
        this.ordphone = ordphone;
        this.ordpost = ordpost;
        this.ordaddr = ordaddr;
    }

    public Orders(int ordpoint, String ordcoupons, int orddeliver, int ordamount, int ordpay, int ordinvoice) {
        this.ordpoint = ordpoint;
        this.ordcoupons = ordcoupons;
        this.orddeliver = orddeliver;
        this.ordamount = ordamount;
        this.ordpay = ordpay;
        this.ordinvoice = ordinvoice;
    }

    public Orders(int ordcode) {
        this.ordcode = ordcode;
    }

    public int getOrdid() {
        return ordid;
    }

    public void setOrdid(int ordid) {
        this.ordid = ordid;
    }

    public Date getOrddate() {
        return orddate;
    }

    public void setOrddate(Date orddate) {
        this.orddate = orddate;
    }

    public String getOrdname() {
        return ordname;
    }

    public void setOrdname(String ordname) {
        this.ordname = ordname;
    }

    public String getOrdphone() {
        return ordphone;
    }

    public void setOrdphone(String ordphone) {
        this.ordphone = ordphone;
    }

    public int getOrdpost() {
        return ordpost;
    }

    public void setOrdpost(int ordpost) {
        this.ordpost = ordpost;
    }

    public String getOrdaddr() {
        return ordaddr;
    }

    public void setOrdaddr(String ordaddr) {
        this.ordaddr = ordaddr;
    }

    public int getOrdpoint() {
        return ordpoint;
    }

    public void setOrdpoint(int ordpoint) {
        this.ordpoint = ordpoint;
    }

    public String getOrdcoupons() {
        return ordcoupons;
    }

    public void setOrdcoupons(String ordcoupons) {
        this.ordcoupons = ordcoupons;
    }

    public int getOrddeliver() {
        return orddeliver;
    }

    public void setOrddeliver(int orddeliver) {
        this.orddeliver = orddeliver;
    }

    public int getOrdamount() {
        return ordamount;
    }

    public void setOrdamount(int ordamount) {
        this.ordamount = ordamount;
    }

    public int getOrdpay() {
        return ordpay;
    }

    public void setOrdpay(int ordpay) {
        this.ordpay = ordpay;
    }

    public int getOrdinvoice() {
        return ordinvoice;
    }

    public void setOrdinvoice(int ordinvoice) {
        this.ordinvoice = ordinvoice;
    }

    public int getOrdcode() {
        return ordcode;
    }

    public void setOrdcode(int ordcode) {
        this.ordcode = ordcode;
    }
}
