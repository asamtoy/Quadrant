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


        //Get from shared preferences the list of todos
        SharedPreferences sharedPrefs = getSharedPreferences(getString(R.string.TODOLIST), Context.MODE_PRIVATE);
        String toDoListString = sharedPrefs.getString("ToDoList", "");
        Gson gson = new Gson();
        TypeToken<ArrayList<ToDo>> toDoArrayList = new TypeToken<ArrayList<ToDo>>(){};
        ArrayList<ToDo> myToDos = gson.fromJson("", toDoArrayList.getType());

        if( myToDos == null ){
            ToDoList toDoList = new ToDoList();//creating from scratch
            myToDos = toDoList.getToDoList();
        }

        //add our new todo to the mytodos
            //make a new to do
        TextView list = (TextView)findViewById(R.id.toDoTitleInput);
        String toDoString = "";

        for(ToDo t : myToDos){
            toDoString += t.getTitle() + "\n";
        }

        list.setText(toDoString);

//        Put title in a new ToDo
//        Add that ToDo to the array that displays in the main page

//        TextView list = (TextView)findViewById(R.id.toDoTitleInput);

//
//        String titleInput = "";
//
//        for(ToDo t : myToDos){
//            ToDo newToDo = new ToDo;
//
//            newToDo.add(myToDos);
//            myToDos += newToDo;
//
//        }
//
//        toDoString.

//        TextView list = (TextView)findViewById(R.id.favourites_list);
//        String movieString = "";
//
//        for(Movie m : myFavourites){
//            movieString += m.getTitle() + " " + m.getYear() + "\n";
//        }
//
//        list.setText(movieString);



//        list.setText(movieString);
//        SharedPreferences.Editor editor = sharedPrefs.edit();
//        editor.putString(toDoTitleInput.getText().toString(), gson.toJson(myToDos));
//        editor.apply();

        //add it to mytodos

        //log the length of todos and check it has grown

        //saving the todos to share preferences
//        SharedPreferences.Editor editor = sharedPrefs.edit();
//        editor.putString("ToDoList", gson.toJson(myToDos));
//        editor.apply();

        //start the main activity
    }

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

