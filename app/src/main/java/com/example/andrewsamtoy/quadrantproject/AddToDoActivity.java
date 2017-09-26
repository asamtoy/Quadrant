package com.example.andrewsamtoy.quadrantproject;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

import static android.R.attr.button;

public class AddToDoActivity extends AppCompatActivity {

    ToDo toDo;

    EditText toDoTitle;
    EditText toDoDetails;
    ToggleButton toggleImportant;
    ToggleButton toggleUrgent;
    Button saveToList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_do);

        Button saveToList = (Button) findViewById(R.id.saveToList);
        saveToList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AddToDoActivity.this, MainActivity.class));
            }

        });
    }
    public void onSaveButtonClicked(View button) {
        Intent intent = new Intent(this, MainActivity.class);
        String title = toDoTitle.getText().toString();
        intent.putExtra("This is the title", title);

        startActivity(intent);

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
