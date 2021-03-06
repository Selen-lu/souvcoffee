package com.company.souvcoffee.MY.my;

public class Img {
    public Img() {}

    private int imgid;
    private String  imgcoff;
    private String imgdess;
    private String imgpack;
    private String imggoods;


    public Img(int imgid, String imgcoff, String imgdess, String imgpack, String imggoods) {
        this.imgid = imgid;
        this.imgcoff = imgcoff;
        this.imgdess = imgdess;
        this.imgpack = imgpack;
        this.imggoods = imggoods;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }

    public String getImgcoff() {
        return imgcoff;
    }

    public void setImgcoff(String imgcoff) {
        this.imgcoff = imgcoff;
    }

    public String getImgdess() {
        return imgdess;
    }

    public void setImgdess(String imgdess) {
        this.imgdess = imgdess;
    }

    public String getImgpack() {
        return imgpack;
    }

    public void setImgpack(String imgpack) {
        this.imgpack = imgpack;
    }

    public String getImggoods() {
        return imggoods;
    }

    public void setImggoods(String imggoods) {
        this.imggoods = imggoods;
    }
}


