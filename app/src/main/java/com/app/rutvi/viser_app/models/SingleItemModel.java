package com.app.rutvi.viser_app.models;

public class SingleItemModel {


    private String name;
    private String url;
    private String description;
    private int price;
    private float miles;
    public SingleItemModel() {
    }

    public SingleItemModel(String name, String url, int price, float miles) {
        this.name = name;
        this.url = url;
        this.price = price;
        this.miles = miles;

    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMiles() {
        return miles;
    }
    public void setMiles(float miles) {
        this.miles= miles;
    }
    public void setPrice(int price) {
        this.price= price;
    }
    public float getPrice() {
        return price;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
