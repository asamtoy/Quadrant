package com.example.andrewsamtoy.quadrantproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ViewToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_to_do);


        Intent intent = getIntent();
        ToDo toDo = (ToDo) intent.getSerializableExtra("To Do");
        Log.d("To Do Details", toDo.toString());

//        FIND VIEW BY ID

    }

}
