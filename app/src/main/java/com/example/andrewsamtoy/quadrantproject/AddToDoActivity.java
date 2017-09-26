package com.example.andrewsamtoy.quadrantproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

public class AddToDoActivity extends AppCompatActivity {

    ToDo toDo;

    EditText toDoTitle;
    EditText toDoDetails;
    ToggleButton toggleImportant;
    ToggleButton toggleUrgent;
    Button saveToList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

//        toDo = new ToDo();


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_do);



    }

//    public void setToDoTitle(Text text) {
//        String toDoTitleInput = toDoTitle.getText().toString();
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
//    public void onSaveButtonClicked(View button){
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);
//
//    }

}
