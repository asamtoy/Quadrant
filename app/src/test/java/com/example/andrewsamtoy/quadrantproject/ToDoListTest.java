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
        toDo1 = new ToDo("Planning", true, true);
        toDo2 = new ToDo("Make pizza", false, false);
        toDoList.add(toDo1);
        toDoList.add(toDo2);
    }

    @Test
    public void testAddToToDoList(){
        assertEquals(2, toDoList.getLength());
    }

    @Test
    public void testGetByIndexTestToDo(){
        assertEquals("Planning", toDoList.get(0).getToDo());
        assertEquals("Make pizza", toDoList.get(1).getToDo());

    }
    @Test
    public void testRanking0(){
        assertEquals(true, toDoList.get(0).isImportant());
        assertEquals(true, toDoList.get(0).isUrgent());
    }

    @Test
    public void testRanking1(){
        assertEquals(false, toDoList.get(1).isImportant());
        assertEquals(false, toDoList.get(1).isUrgent());
    }

    @Test
    public void testRemoveToDo(){
        toDoList.remove(0);
        assertEquals(1, toDoList.getLength());
    }
}
