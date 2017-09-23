package com.example.andrewsamtoy.quadrantproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ToDo extends AppCompatActivity {

    private String toDo;
    private int rank;

    public ToDo(String toDo, int rank){
        this.toDo = toDo;
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public String getToDo() {
        return toDo;
    }

//    public void save(){
//        int rank = rank.getRank();
//
//
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do);
    }
}
