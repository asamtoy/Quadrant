package com.example.andrewsamtoy.quadrantproject;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sharedPrefs = getSharedPreferences(getString(R.string.TODOLIST), Context.MODE_PRIVATE);
        String toDoListString = sharedPrefs.getString("ToDoList", "{}");
        Gson gson = new Gson();
        TypeToken<ToDoList> toDoArrayList = new TypeToken<ToDoList>(){};
        ToDoList myToDos = gson.fromJson(toDoListString, toDoArrayList.getType());

        Log.d("My To Dos", String.valueOf(myToDos.getToDoList().size()));

        ToDosAdapter ToDosAdapter = new ToDosAdapter(this, myToDos.getToDoList());
        ListView listView = (ListView) findViewById(R.id.toDoList);
        listView.setAdapter(ToDosAdapter);

        FloatingActionButton addButton = (FloatingActionButton) findViewById(R.id.addButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AddToDoActivity.class));
            }

        });
    }

    public void getToDo(View listItem){
            ToDo toDo = (ToDo) listItem.getTag();
            Log.d("To Do " , toDo.getToDoTitle());
            Log.d("Details: ", toDo.getToDoDetails());
            Log.d("Urgent? ", String.valueOf(toDo.isUrgent()));
            Log.d("Important? ", String.valueOf(toDo.isImportant()));

            Intent intent = new Intent(this, ViewToDoActivity.class);
            Gson gson = new Gson();
            String toDoString = gson.toJson(toDo);
            intent.putExtra("toDo", toDoString);
            startActivity(intent);
    }

    public void onAddButtonClick(View view){
        Log.d("Button clicked!", "Button click");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
