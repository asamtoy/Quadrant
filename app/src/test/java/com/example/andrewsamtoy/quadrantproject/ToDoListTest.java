package com.example.andrewsamtoy.quadrantproject;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by andrewsamtoy on 9/22/17.
 */

public class ToDoListTest {

    ToDoList toDoList;
    ToDo toDo1;
    ToDo toDo2;

    @Before
    public void before(){
        toDoList = new ToDoList();
        toDo1 = new ToDo("Planning", 1);
        toDo2 = new ToDo("Coding", 2);
    }

    @Test
    public void testAddToToDoList(){
        toDoList.add(toDo1);
        toDoList.add(toDo2);
        assertEquals(2, toDoList.getLength());
    }
}
