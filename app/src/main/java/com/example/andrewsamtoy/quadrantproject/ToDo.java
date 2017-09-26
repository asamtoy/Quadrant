package com.example.andrewsamtoy.quadrantproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.Serializable;

public class ToDo extends AppCompatActivity implements Serializable {

    private String toDoTitle;
    private String details;
    private boolean urgent;
    private boolean important;
    private boolean complete;

    public ToDo(String toDoTitle, String details, boolean important, boolean urgent, boolean complete){
        this.toDoTitle = toDoTitle;
        this.details = details;
        this.important = important;
        this.urgent = urgent;
        this.complete = complete;
    }
    public ToDo(String toDoTitle, boolean important, boolean urgent, boolean complete){
        this.toDoTitle = toDoTitle;
        this.details = "No Details";
        this.important = important;
        this.urgent = urgent;
        this.complete = complete;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public boolean isImportant() {
        return important;
    }

    public boolean isComplete(){ return complete; }

    public String getToDoTitle() {
        return toDoTitle;
    }


//    public int calculateImportance(){
//        if (this.isImportant()) {
//            this.rank = this.rank + 2;
//        }
//        return this.rank;
//    }
//
//    public int calculateUrgency(){
//        if (this.isUrgent()) {
//            this.rank = this.rank + 1;
//        }
//        return this.rank;
//    }

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

    public String completed(){
        if (this.isComplete()){
            this.urgent = false;
            this.important = false;
            return "COMPLETE";
        }
        return "";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do);
    }
}
