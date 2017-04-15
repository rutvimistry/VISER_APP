package com.app.rutvi.viser_app.models;

import java.util.ArrayList;


public class SectionDataModel {



    private String headerTitle;
    private ArrayList<SingleItemModel> allItemsInSection;
    private int price;
    private float miles;

    public SectionDataModel() {

    }
    public SectionDataModel(String headerTitle, ArrayList<SingleItemModel> allItemsInSection, int price, float miles) {
        this.headerTitle = headerTitle;
        this.allItemsInSection = allItemsInSection;
        this.price =price;
        this.miles = miles;
    }



    public String getHeaderTitle() {
        return headerTitle;
    }

    public void setHeaderTitle(String headerTitle) {
        this.headerTitle = headerTitle;
    }

    public ArrayList<SingleItemModel> getAllItemsInSection() {
        return allItemsInSection;
    }

    public void setAllItemsInSection(ArrayList<SingleItemModel> allItemsInSection) {
        this.allItemsInSection = allItemsInSection;
    }

    public float getMiles() {
        return miles;
    }

    public void setMiles(float miles) {
        this.miles = miles;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
