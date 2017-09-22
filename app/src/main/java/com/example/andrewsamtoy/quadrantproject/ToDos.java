package com.example.andrewsamtoy.quadrantproject;

import java.util.ArrayList;

/**
 * Created by andrewsamtoy on 9/22/17.
 */

public class ToDos {

    private ArrayList<ToDoActivity> list;

    public ToDos(){
        list = new ArrayList<ToDoActivity>();
        list.add(new ToDoActivity(1, "Get week groceries - Tesco, Valvona, Co-Op"));
        list.add(new ToDoActivity(2, "Finish Drucker book"));
        list.add(new ToDoActivity(1, "re-bind thumb"));
        list.add(new ToDoActivity(4, "Wash out water bottle"));
        list.add(new ToDoActivity(3, "Take photos for blog"));

    }

    public ArrayList<ToDoActivity> getList(){ return new ArrayList<ToDoActivity>(list);}
}
