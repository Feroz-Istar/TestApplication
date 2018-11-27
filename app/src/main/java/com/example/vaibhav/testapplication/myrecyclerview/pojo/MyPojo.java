package com.example.vaibhav.testapplication.myrecyclerview.pojo;

public class MyPojo {
    private String image;
    private String title;
    private Integer price;

    public MyPojo() {
    }

    public MyPojo(String image, String title, Integer price) {
        this.image = image;
        this.title = title;
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}