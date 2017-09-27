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
//        String toDoListString = sharedPrefs.getString("ToDoList", new ArrayList<ToDo>().toString());
        String toDoListString = sharedPrefs.getString("ToDoList", "");

        Gson gson = new Gson();
        TypeToken<ArrayList<ToDo>> toDoArrayList = new TypeToken<ArrayList<ToDo>>(){};
        ArrayList<ToDo> myToDos = gson.fromJson(toDoListString, toDoArrayList.getType());

        if (myToDos == null){
            myToDos = new ArrayList<ToDo>();
        }

        ToDo newToDo = new ToDo(title, details, isImportant, isUrgent, false);
        myToDos.add(newToDo);

        Log.d("let me see my To Dos, ", "I need this log so we can stop on the line before in debug mode");
        Log.d("Length of To Dos: ", String.valueOf(myToDos.size()));
    }

        //add our new todo to the mytodos

        //add it to mytodos

        //log the length of todos and check it has grown

        //saving the todos to share preferences
//        SharedPreferences.Editor editor = sharedPrefs.edit();
//        editor.putString("ToDoList", gson.toJson(myToDos));
//        editor.apply();

        //start the main activity


//    public void onTitleEntered (View EditText){
//        String title = toDoTitleInput.getText().toString();
//        Log.d("Title entered: ", title);
//    }

}







//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);

//        startActivity(intent);
//        Intent intent = new Intent(this, MainActivity.class);
//        String title = toDoTitleInput.getText().toString();
//        intent.putExtra("This is the title", title);

//    public void setToDoTitle(Text text) {
//        String toDoTitleInput = toDo.getToDoTitle();
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);
//    }
//
//    public void setToDoDetails(Text text){
//        String details = toDoDetails.getText().toString();
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);
//    }
//
//    public void setToggleImportant(ToggleButton toggleImportant){
////        Boolean isImportant = toggleImportant.getInputType().toString;
//    }



//    NOT SURE THIS IS RIGHT

//
//    }
//            saveToList.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String title = toDoTitle.getText().toString();
////        intent.putExtra("This is the title", title);
//                Log.d("This is the title: ", title);
//
////                startActivity(new Intent(AddToDoActivity.this, MainActivity.class));
//            }
//        });

