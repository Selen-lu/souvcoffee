package com.company.souvcoffee.MS.domain;

import java.sql.Date;


public class User {

    public User() {}

    private int uscode; //pk
    private String usname;
    private String  usid;
    private String uspw;
    private int usgender;
    private int usage;
    private String usphone;
    private String usemail;
    private Date  usbirthday;
    private int uspost;
    private String usaddress;
    private byte  usagree;
   private int  uslevel;
    private int usbuy;
    private int uspoint;
    private Date usreg;
    private byte  uswidr;

    public User(int uscode, String usname, String usid, String uspw, int usgender, int usage) {
        this.uscode = uscode;
        this.usname = usname;
        this.usid = usid;
        this.uspw = uspw;
        this.usgender = usgender;
        this.usage = usage;
    }

    public User(String usphone, String usemail, Date usbirthday, int uspost, String usaddress, byte usagree) {
        this.usphone = usphone;
        this.usemail = usemail;
        this.usbirthday = usbirthday;
        this.uspost = uspost;
        this.usaddress = usaddress;
        this.usagree = usagree;
    }

    public User(int uslevel, int usbuy, int uspoint, Date usreg, byte uswidr) {
        this.uslevel = uslevel;
        this.usbuy = usbuy;
        this.uspoint = uspoint;
        this.usreg = usreg;
        this.uswidr = uswidr;
    }

    public int getUscode() {
        return uscode;
    }

    public void setUscode(int uscode) {
        this.uscode = uscode;
    }

    public String getUsname() {
        return usname;
    }

    public void setUsname(String usname) {
        this.usname = usname;
    }

    public String getUsid() {
        return usid;
    }

    public void setUsid(String usid) {
        this.usid = usid;
    }

    public String getUspw() {
        return uspw;
    }

    public void setUspw(String uspw) {
        this.uspw = uspw;
    }

    public int getUsgender() {
        return usgender;
    }

    public void setUsgender(int usgender) {
        this.usgender = usgender;
    }

    public int getUsage() {
        return usage;
    }

    public void setUsage(int usage) {
        this.usage = usage;
    }

    public String getUsphone() {
        return usphone;
    }

    public void setUsphone(String usphone) {
        this.usphone = usphone;
    }

    public String getUsemail() {
        return usemail;
    }

    public void setUsemail(String usemail) {
        this.usemail = usemail;
    }

    public Date getUsbirthday() {
        return usbirthday;
    }

    public void setUsbirthday(Date usbirthday) {
        this.usbirthday = usbirthday;
    }

    public int getUspost() {
        return uspost;
    }

    public void setUspost(int uspost) {
        this.uspost = uspost;
    }

    public String getUsaddress() {
        return usaddress;
    }

    public void setUsaddress(String usaddress) {
        this.usaddress = usaddress;
    }

    public byte getUsagree() {
        return usagree;
    }

    public void setUsagree(byte usagree) {
        this.usagree = usagree;
    }

    public int getUslevel() {
        return uslevel;
    }

    public void setUslevel(int uslevel) {
        this.uslevel = uslevel;
    }

    public int getUsbuy() {
        return usbuy;
    }

    public void setUsbuy(int usbuy) {
        this.usbuy = usbuy;
    }

    public int getUspoint() {
        return uspoint;
    }

    public void setUspoint(int uspoint) {
        this.uspoint = uspoint;
    }

    public Date getUsreg() {
        return usreg;
    }

    public void setUsreg(Date usreg) {
        this.usreg = usreg;
    }

    public byte getUswidr() {
        return uswidr;
    }

    public void setUswidr(byte uswidr) {
        this.uswidr = uswidr;
    }
}
