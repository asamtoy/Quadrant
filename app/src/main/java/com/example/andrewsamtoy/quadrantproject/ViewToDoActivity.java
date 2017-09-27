package com.example.andrewsamtoy.quadrantproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ViewToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_to_do);


        Intent intent = getIntent();
        String toDoString = intent.getStringExtra("toDo");
        Gson gson = new Gson();
        ToDo toDo = gson.fromJson(toDoString, ToDo.class);
//        Log.d("To Do Details", );
        Log.d("IT WORKS", toDoString);

        TextView textTitle = (TextView) findViewById(R.id.textTitle);
        TextView textDetails = (TextView) findViewById(R.id.textDetails);
        TextView textUrgent = (TextView) findViewById((R.id.textUrgent));
        TextView textImportant = (TextView) findViewById((R.id.textImportant));

        textTitle.setText(toDo.getToDoTitle());
        textDetails.setText(toDo.getToDoDetails());
        textUrgent.setText(toDo.urgency());
        textImportant.setText(toDo.importance());

    }

}
