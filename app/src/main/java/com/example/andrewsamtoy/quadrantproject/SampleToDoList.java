package com.example.andrewsamtoy.quadrantproject;

/**
 * Created by andrewsamtoy on 9/24/17.
 */

import java.util.ArrayList;

public class SampleToDoList {

    private ArrayList<ToDo> list;

    public SampleToDoList(){
    list = new ArrayList<ToDo>();
        list.add(new ToDo("Get soy sauce", false, true));
        list.add(new ToDo("Saddle soap tan boots", true, false));
        list.add(new ToDo("Find prism glasses", true, true));
        list.add(new ToDo("Post Levuka blog post", false, true));
        list.add(new ToDo("Get coffee", true, false));
        list.add(new ToDo("Write letter to Grandma Alice", true, true));
        list.add(new ToDo("Write letter to Step", true, true));
        list.add(new ToDo("Take down trash", true, false));
        list.add(new ToDo("Inbox zero", true, false));
        list.add(new ToDo("Check data", false, false));
        list.add(new ToDo("Cook soup", false, true));
        list.add(new ToDo("Text Simon and Dan - club in afternoon", false, false));
        list.add(new ToDo("Research how to stretch out wool sweater", false, false));

    }
    public ArrayList<ToDo> getList() {
        return new ArrayList<ToDo>(list);
    }

}
