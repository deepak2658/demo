package com.example.hashcode;

public class Street {
    public int start;
    public int end;
    public String name;
    int time;

    Street(){}
    Street(int start,int end, String name,int time){
        this.start = start;
        this.end = end;
        this.name = name;
        this.time = time;
    }
}
