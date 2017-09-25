package com.example.andrewsamtoy.quadrantproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ToDo extends AppCompatActivity {

    private int rank;
    private String toDo;
    private String details;
    private boolean urgent;
    private boolean important;

    public ToDo(int rank, String toDo, String details, boolean important, boolean urgent){
        this.rank = rank;
        this.toDo = toDo;
        this.details = details;
        this.important = important;
        this.urgent = urgent;
    }
    public ToDo(int rank, String toDo, boolean important, boolean urgent){
        this.rank = rank;
        this.toDo = toDo;
        this.details = "No Details";
        this.important = important;
        this.urgent = urgent;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public boolean isImportant() {
        return important;
    }

    public String getToDo() {
        return toDo;
    }

    public int getRank(){
        return rank;
    }

    public String importance() {
        if (this.isImportant()) {
            return "IMPORTANT";
        }
        return "";
    }

    public String urgency() {
        if (this.isUrgent()) {
            return "URGENT";
        }
        return "";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do);
    }
}
