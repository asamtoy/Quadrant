package com.example.andrewsamtoy.quadrantproject;

/**
 * Created by andrewsamtoy on 9/24/17.
 */

import java.util.ArrayList;

public class SampleToDoList {

    private ArrayList<ToDo> list;

    public SampleToDoList(){
    list = new ArrayList<ToDo>();
        list.add(new ToDo(0, "Get soy sauce", false, true, false));
        list.add(new ToDo(0, "Saddle soap tan boots", true, false, false));
        list.add(new ToDo(0, "Find prism glasses", true, true, false));
        list.add(new ToDo(0, "Post Levuka blog post", false, true, false));
        list.add(new ToDo(0, "Get coffee", true, false, false));
        list.add(new ToDo(0, "Write letter to Grandma Alice", true, true, false));
        list.add(new ToDo(0, "Write letter to Step", true, true, false));
        list.add(new ToDo(0, "Take down trash", true, false, false));
        list.add(new ToDo(0, "Inbox zero", true, false, false));
        list.add(new ToDo(0, "Check data", false, false, false));
        list.add(new ToDo(0, "Cook soup", false, true, false));
        list.add(new ToDo(0, "Text Simon and Dan - club in afternoon", false, false, false));
        list.add(new ToDo(0, "Research how to stretch out wool sweater", false, false, false));

    }
    public ArrayList<ToDo> getList() {
        return new ArrayList<ToDo>(list);
    }

}
