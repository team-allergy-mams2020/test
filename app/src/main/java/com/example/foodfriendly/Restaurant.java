package com.example.foodfriendly;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.Serializable;

public class Restaurant implements Serializable{
    private String restaurant_name;
    private ArrayList<Menu_Item> menu = new ArrayList<Menu_Item>();

    public Restaurant() {

    }

    public Restaurant(String restaurant_name, ArrayList<Menu_Item> menu) {
        this.restaurant_name = restaurant_name;
        this.menu = menu;
    }

    public String getRestaurant_name() {
        return restaurant_name;
    }

    public void setRestaurant_name(String restaurant_name) {
        this.restaurant_name = restaurant_name;
    }

    public ArrayList<Menu_Item> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<Menu_Item> menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        String str = restaurant_name;
        for(Menu_Item mi : menu) {
            if(mi != null)
                str += mi.toString();
        }
        return str;
    }

    private void readObject(ObjectInputStream inputStream) throws ClassNotFoundException, IOException {
        inputStream.defaultReadObject();
    }

    private void writeObject(ObjectOutputStream outputStream) throws IOException {
        outputStream.defaultWriteObject();
    }
}
