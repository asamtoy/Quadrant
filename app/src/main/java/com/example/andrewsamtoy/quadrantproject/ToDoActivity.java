package com.example.andrewsamtoy.quadrantproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ToDoActivity extends AppCompatActivity {

    private int ranking;
    private String toDo;

    public ToDoActivity(int ranking, String toDo){
        this.ranking = ranking;
        this.toDo = toDo;
    }

    public int getRanking() {
        return ranking;
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
