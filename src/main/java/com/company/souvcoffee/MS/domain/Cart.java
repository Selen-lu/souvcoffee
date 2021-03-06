package com.company.souvcoffee.MS.domain;

public class Cart {
        private int canum; //pk
        private String cap;//fk
        private int caamount;
        private int cacode;//fk

    public Cart() {}

    public Cart(int canum, String cap, int caamount, int cacode) {
        this.canum = canum;
        this.cap = cap;
        this.caamount = caamount;
        this.cacode = cacode;
    }

    public int getCanum() {
        return canum;
    }

    public void setCanum(int canum) {
        this.canum = canum;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public int getCaamount() {
        return caamount;
    }

    public void setCaamount(int caamount) {
        this.caamount = caamount;
    }

    public int getCacode() {
        return cacode;
    }

    public void setCacode(int cacode) {
        this.cacode = cacode;
    }
}
