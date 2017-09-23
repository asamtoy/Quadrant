package com.example.andrewsamtoy.quadrantproject;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by andrewsamtoy on 9/22/17.
 */

public class ToDoList implements Serializable {
    private ArrayList<ToDo> toDoList;

    public ToDoList(){
        toDoList = new ArrayList<ToDo>();
    }

    public ToDoList(ArrayList<ToDo> presetToDoList) {
        toDoList = new ArrayList<>(presetToDoList);
    }

    public void add(ToDo toDo){
        toDoList.add(toDo);
    }

    public void remove(ToDo toDo){
        toDoList.remove(toDo);
    }

    public int getLength() {

        return toDoList.size();
    }

    public ToDo returnByIndex(){
        toDoList.get();
    }
//    public ArrayList<ToDo> getList(){
//        return new ArrayList<ToDo>(toDoList);}

    //    public void setUpToDoList() {
//        ToDo[] toDosToAdd = {
//                "Make pizza dough",
//                "Grind coffee"
//        };
//        for (ToDo toDo : toDosToAdd) {
//            this.toDoList.add(toDo);
//        }
//    }

}

