package com.geekbrains.app;

import java.util.Random;

public class Product {

    int id;
    String title;
    int cost;

    public Product (int id, String title, int cost){
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public String productInfo(){
        return ("\nId: " + id + "\nTitle: " + title + "\nCost:" + cost);
    }

}
