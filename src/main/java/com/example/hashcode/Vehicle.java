package com.example.hashcode;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    public int noStreets;
    public ArrayList<String> streetList = new ArrayList<>();

    Vehicle(int noStreets,ArrayList<String> streetList){
        this.noStreets = noStreets;
        this.streetList = streetList;
    }
}
