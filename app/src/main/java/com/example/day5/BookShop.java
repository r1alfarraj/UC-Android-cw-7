package com.example.day5;

import java.io.Serializable;

public class BookShop implements Serializable {

    private String bookName;
    private  double bookPrice;
    private  String bookImg;
    private String bookType;

    public BookShop() {
    }

    public BookShop(String bookName, double phonePrice, String bookImg, String bookType) {
        this.bookName = bookName;
        this.bookPrice = phonePrice;
        this.bookImg = bookImg;
        this.bookType = bookType;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPhonePrice() {
        return bookPrice;
    }

    public void setPhonePrice(double phonePrice) {
        this.bookPrice = phonePrice;
    }

    public String getBookImg() {
        return bookImg;
    }

    public void setBookImg(String bookImg) {
        this.bookImg = bookImg;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }
}
