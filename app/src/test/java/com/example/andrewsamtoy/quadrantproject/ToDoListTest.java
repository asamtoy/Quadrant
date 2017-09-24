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
        toDo1 = new ToDo(1, "Planning", true, true);
        toDo2 = new ToDo(2, "Make pizza", false, false);
        toDo3 = new ToDo(3, "Set pomodoro timer", false, true);
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

    @Test
    public void testGetRank(){
        assertEquals(1, toDoList.get(0).getRank());
        assertEquals(2, toDoList.get(1).getRank());
    }

    @Test
    public void canCreateCustomToDoList() {
        ArrayList<ToDo> customToDoList = new ArrayList<>();
        toDo1 = new ToDo(1, "PLANNING", true, true);
        toDo2 = new ToDo(2, "Hydrate", true, true);
        toDo3 = new ToDo(3, "Cook soup", true, false);
        toDo4 = new ToDo(4, "vacuum", true, false);
        toDo5 = new ToDo(5, "Feed sourdough starter", true, false);

        customToDoList.add(toDo1);
        customToDoList.add(toDo2);
        customToDoList.add(toDo3);
        customToDoList.add(toDo4);
        customToDoList.add(toDo5);
        ToDoList toDoListWithNewAnswers = new ToDoList(customToDoList);

        assertEquals(5, toDoListWithNewAnswers.getLength());
        assertEquals("Cook soup", toDo3.getToDo());
        assertEquals("vacuum", toDo4.getToDo());
        assertEquals("vacuum", customToDoList.get(3).getToDo());
        assertEquals(false, customToDoList.get(2).isUrgent());
    }



}
