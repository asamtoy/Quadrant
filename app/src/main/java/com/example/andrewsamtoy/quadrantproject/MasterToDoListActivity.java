//package com.example.andrewsamtoy.quadrantproject;
//
//import android.content.Context;
//import android.content.Intent;
//import android.content.SharedPreferences;
//import android.support.v4.widget.TextViewCompat;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.util.Log;
//import android.widget.ListView;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import com.google.gson.Gson;
//import com.google.gson.reflect.TypeToken;
//
//import java.util.ArrayList;
//
//public class MasterToDoListActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_master_to_do_list);
//
////        Get the To Do to the Master List
//        Intent intent = getIntent();
//        ToDo toDo = (ToDo) intent.getSerializableExtra("toDoToAdd");
//        Log.d("ToDo in Master List", toDo.toString());
//
////        Get the saved ToDos - JSON
//        SharedPreferences sharedPrefs = getSharedPreferences("toDo_List", Context.MODE_PRIVATE);
//        String masterListJson = sharedPrefs.getString("Master list", new ArrayList<ToDo>().toString());
//        Log.d("saved master list JSON", masterListJson);
//
////        Convert JSON Array into an ArrayList of ToDos
//        Gson gson = new Gson();
//        TypeToken<ArrayList<ToDo>> toDoArrayList = new TypeToken<ArrayList<ToDo>>(){};
//        ArrayList<ToDo> myList = gson.fromJson(masterListJson, toDoArrayList.getType());
//        Log.d("Updated List", myList.toString());
//
//
////    Adding activity to this list?
//        ToDo newToDo = (ToDo) getIntent().getSerializableExtra(("toDo"));
//        myList.add(newToDo);
//        Log.d("myList", myList);
//
//
//////        Update the view
//        TextView myListList = (TextView) findViewById(R.id.toDoList);
//        String toDoList = "";
//        for (ToDo currentToDo : myList) {
//            toDoList += currentToDo.getToDoTitle() + " - " + currentToDo.isUrgent() + "\n";
//        }
//        myListList.setText(toDoList);
//
////        Save the ToDos to Shared Preferences
//        sharedPrefs.edit()
//                .putString("Master List", gson.toJson(myList))
//                .apply();
//
//        Toast.makeText(this, "Added " + toDo.getToDoTitle(), Toast.LENGTH_LONG).show();
////
//    }
//}
