package com.example.andrewsamtoy.quadrantproject;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

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

        Log.d("To Do Title", title.toString());
        Log.d("To Do Details", details.toString());
        Log.d("Is this important? ", isImportant.toString());
        Log.d("Is this urgent? ", isUrgent.toString());

//        startActivity(intent);
//        Intent intent = new Intent(this, MainActivity.class);
//        String title = toDoTitleInput.getText().toString();
//        intent.putExtra("This is the title", title);

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
    //        saveToList.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String title = toDoTitle.getText().toString();
////        intent.putExtra("This is the title", title);
//                Log.d("This is the title: ", title);
//
////                startActivity(new Intent(AddToDoActivity.this, MainActivity.class));
//            }
//        });

}
