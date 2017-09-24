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

    public void add(ToDo toDo){
        toDoList.add(toDo);
    }

    public void remove(int index){
        toDoList.remove(index);
    }

    public void clearToDos(){
        toDoList.clear();
    }

    public int getLength() {

        return toDoList.size();
    }

    public ToDo get(int index){
        return this.toDoList.get(index);
    }

    public ToDoList(ArrayList<ToDo> customToDoList) {
        toDoList = new ArrayList<>(customToDoList);
    }

//    public ToDo modify(){
//        toDoList.get(int index);
//        toDoList.set(int index, toDo);

//        Retrieve both string and rank
//        Allow to
//        Save
//    }

}

