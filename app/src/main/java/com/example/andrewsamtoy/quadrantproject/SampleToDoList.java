package com.example.andrewsamtoy.quadrantproject;

/**
 * Created by andrewsamtoy on 9/24/17.
 */

import java.util.ArrayList;

public class SampleToDoList {

    private ArrayList<ToDo> list;

    public SampleToDoList(){
    list = new ArrayList<ToDo>();
        list.add(new ToDo(1, "Get soy sauce", false, true));
        list.add(new ToDo(2, "Saddle soap tan boots", true, false));
        list.add(new ToDo(3, "Find prism glasses", true, true));
        list.add(new ToDo(4, "Post Levuka blog post", false, true));
        list.add(new ToDo(5, "Get coffee", true, false));
        list.add(new ToDo(6, "Write letter to Grandma Alice", true, true));
        list.add(new ToDo(7, "Write letter to Step", true, true));
        list.add(new ToDo(8, "Take down trash", true, false));
        list.add(new ToDo(9, "Inbox zero", true, false));
        list.add(new ToDo(10, "Check data", false, false));
        list.add(new ToDo(11, "Cook soup", false, true));
        list.add(new ToDo(12, "Text Simon and Dan - club in afternoon", false, false));
        list.add(new ToDo(13, "Research how to stretch out wool sweater", false, false));

    }
    public ArrayList<ToDo> getList() {
        return new ArrayList<ToDo>(list);
    }

}
