package com.example.andrewsamtoy.quadrantproject;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.w3c.dom.Text;

import java.util.ArrayList;

import static android.R.attr.button;

public class AddToDoActivity extends AppCompatActivity {

    ToDo toDo;

    EditText toDoTitleInput;
    EditText toDoDetails;
    ToggleButton toggleImportant;
    ToggleButton toggleUrgent;
    Button saveToList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_do);

        toDoTitleInput = (EditText) findViewById(R.id.toDoTitleInput);
        toDoDetails = (EditText) findViewById(R.id.toDoDetails);
        toggleImportant = (ToggleButton) findViewById(R.id.toggleImportant);
        toggleUrgent = (ToggleButton) findViewById(R.id.toggleUrgent);
        saveToList = (Button) findViewById(R.id.saveToList);
    }

    public void onSaveButtonClicked(View button) {

        Log.d("onSaveButton ", "Clicked");
        String title = toDoTitleInput.getText().toString();
        String details = toDoDetails.getText().toString();
        Boolean isImportant = toggleImportant.isChecked();
        Boolean isUrgent = toggleUrgent.isChecked();

        Log.d("To Do Title", title);
        Log.d("To Do Details", details);
        Log.d("Is this important? ", isImportant.toString());
        Log.d("Is this urgent? ", isUrgent.toString());

        SharedPreferences sharedPrefs = getSharedPreferences(getString(R.string.TODOLIST), Context.MODE_PRIVATE);
        String toDoListString = sharedPrefs.getString("ToDoList", "{}");

        Gson gson = new Gson();
        TypeToken<ToDoList> toDoArrayList = new TypeToken<ToDoList>(){};
        ToDoList myToDos = gson.fromJson(toDoListString, toDoArrayList.getType());

        ToDo newToDo = new ToDo(title, details, isImportant, isUrgent, false);
        myToDos.add(newToDo);

        SharedPreferences.Editor editor = sharedPrefs.edit();
        editor.putString("ToDoList", gson.toJson(myToDos));
        editor.apply();

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        Toast.makeText(this, "We've added to your Quadrant", Toast.LENGTH_LONG).show();

    }

}