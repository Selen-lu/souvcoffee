package com.company.souvcoffee.domain.ms;

import java.sql.Date;

public class soProduct {
    public soProduct() {}

    private int pid;
    private String pname;
    private int pprice;
    private int pdiscount;
    private int pstock;
    private String pmf;
    private int pterms;
    private Date preg;
    private int psell;
    private String pori;
    private byte pcaf;


    public soProduct(int pid, String pname, int pprice, int pdiscount, int pstock, String pmf, int pterms) {
        this.pid = pid;
        this.pname = pname;
        this.pprice = pprice;
        this.pdiscount = pdiscount;
        this.pstock = pstock;
        this.pmf = pmf;
        this.pterms = pterms;
    }

    public soProduct(Date preg, int psell, String pori, byte pcaf) {
        this.preg = preg;
        this.psell = psell;
        this.pori = pori;
        this.pcaf = pcaf;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPprice() {
        return pprice;
    }

    public void setPprice(int pprice) {
        this.pprice = pprice;
    }

    public int getPdiscount() {
        return pdiscount;
    }

    public void setPdiscount(int pdiscount) {
        this.pdiscount = pdiscount;
    }

    public int getPstock() {
        return pstock;
    }

    public void setPstock(int pstock) {
        this.pstock = pstock;
    }

    public String getPmf() {
        return pmf;
    }

    public void setPmf(String pmf) {
        this.pmf = pmf;
    }

    public int getPterms() {
        return pterms;
    }

    public void setPterms(int pterms) {
        this.pterms = pterms;
    }

    public Date getPreg() {
        return preg;
    }

    public void setPreg(Date preg) {
        this.preg = preg;
    }

    public int getPsell() {
        return psell;
    }

    public void setPsell(int psell) {
        this.psell = psell;
    }

    public String getPori() {
        return pori;
    }

    public void setPori(String pori) {
        this.pori = pori;
    }

    public byte getPcaf() {
        return pcaf;
    }

    public void setPcaf(byte pcaf) {
        this.pcaf = pcaf;
    }
}
