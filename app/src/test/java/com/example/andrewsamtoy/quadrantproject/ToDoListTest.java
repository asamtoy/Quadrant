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
    ToDo toDo3;
    ToDo toDo4;
    ToDo toDo5;

    @Before
    public void before(){
        toDoList = new ToDoList();
        toDo1 = new ToDo("Planning", true, true, false);
        toDo2 = new ToDo("Make pizza", false, false, false);
        toDo3 = new ToDo("Set pomodoro timer", false, true, false);
        toDoList.add(toDo1);
        toDoList.add(toDo2);
    }

    @Test
    public void testAddToToDoList(){
        assertEquals(2, toDoList.getLength());
    }

    @Test
    public void testGetByIndexTestToDo(){
        assertEquals("Planning", toDoList.get(0).getToDoTitle());
        assertEquals("Make pizza", toDoList.get(1).getToDoTitle());

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

    @Test
    public void canCreateCustomToDoList() {
        ArrayList<ToDo> customToDoList = new ArrayList<>();
        toDo1 = new ToDo("PLANNING", true, true, false);
        toDo2 = new ToDo("Hydrate", true, true, false);
        toDo3 = new ToDo("Cook soup", true, false, false);
        toDo4 = new ToDo("vacuum", true, false, false);
        toDo5 = new ToDo("Feed sourdough starter", true, false, false);

        customToDoList.add(toDo1);
        customToDoList.add(toDo2);
        customToDoList.add(toDo3);
        customToDoList.add(toDo4);
        customToDoList.add(toDo5);
        ToDoList toDoListWithNewAnswers = new ToDoList(customToDoList);

        assertEquals(5, toDoListWithNewAnswers.getLength());
        assertEquals("Cook soup", toDo3.getToDoTitle());
        assertEquals("vacuum", toDo4.getToDoTitle());
        assertEquals("vacuum", customToDoList.get(3).getToDoTitle());
        assertEquals(false, customToDoList.get(2).isUrgent());
    }



}
