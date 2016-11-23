package com.company;


/**
 * Created by boun on 11/22/16.
 */

public class Thing {
    public String name;
    public int quantity;
    String category;

    public Thing(String text, int quantity, String category) {
        this.name = text;
        this.quantity = quantity;
        this.category = category;
    }

    public Thing() {

    }
}
