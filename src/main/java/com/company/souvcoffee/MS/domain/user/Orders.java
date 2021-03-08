package com.company.souvcoffee.MS.domain.user;

import java.sql.Date;

public class Orders {
    public Orders() { }


    private int  ordid;//pk
    private Date orddate;
    private String ordname;
    private String ordphone;
    private String  ordpost;
    private String ordaddr;
    private  int ordpoint;
    private String   ordcoupons;
    private int orddeliver;
    private int ordamount;
    private int  ordpay;
    private int  ordinvoice;
    private int ordcode;  // fk

    public Orders(int ordid, Date orddate, String ordname, String ordphone, String ordpost, String ordaddr, int ordpoint, String ordcoupons) {
        this.ordid = ordid;
        this.orddate = orddate;
        this.ordname = ordname;
        this.ordphone = ordphone;
        this.ordpost = ordpost;
        this.ordaddr = ordaddr;
        this.ordpoint = ordpoint;
        this.ordcoupons = ordcoupons;
    }

    public Orders(int orddeliver, int ordamount, int ordpay, int ordinvoice, int ordcode) {
        this.orddeliver = orddeliver;
        this.ordamount = ordamount;
        this.ordpay = ordpay;
        this.ordinvoice = ordinvoice;
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

    public String getOrdpost() {
        return ordpost;
    }

    public void setOrdpost(String ordpost) {
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


    @Override
    public String toString() {
        return "Orders{" +
                "ordid=" + ordid +
                ", orddate=" + orddate +
                ", ordname='" + ordname + '\'' +
                ", ordphone='" + ordphone + '\'' +
                ", ordpost='" + ordpost + '\'' +
                ", ordaddr='" + ordaddr + '\'' +
                ", ordpoint=" + ordpoint +
                ", ordcoupons='" + ordcoupons + '\'' +
                ", orddeliver=" + orddeliver +
                ", ordamount=" + ordamount +
                ", ordpay=" + ordpay +
                ", ordinvoice=" + ordinvoice +
                ", ordcode=" + ordcode +
                '}';
    }
}
