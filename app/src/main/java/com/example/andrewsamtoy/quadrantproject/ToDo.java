package com.example.andrewsamtoy.quadrantproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ToDo extends AppCompatActivity {

    private String toDo;
    private boolean urgent;
    private boolean important;

    public ToDo(String toDo, boolean important, boolean urgent){
        this.toDo = toDo;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do);
    }
}
