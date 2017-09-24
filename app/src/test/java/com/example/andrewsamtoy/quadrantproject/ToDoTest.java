package com.example.andrewsamtoy.quadrantproject;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by andrewsamtoy on 9/22/17.
 */

public class ToDoTest {
    ToDo toDo;

    @Before
    public void before(){
        toDo = new ToDo(1, "Drink water", false, false);
    }


    @Test
    public void testImportant(){
    assertEquals(false, toDo.isImportant());
    }

    @Test
    public void testIsUrgent(){
        assertEquals(false, toDo.isUrgent());
    }

    @Test
    public void testToDoString(){
        assertEquals("Drink water", toDo.getToDo());
    }
}
