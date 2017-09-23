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
        toDo = new ToDo("Drink water", 2);
    }


    @Test
    public void testToDoRank(){
    assertEquals(2, toDo.getRank());
    }

    @Test
    public void testToDoString(){
        assertEquals("Drink water", toDo.getToDo());
    }
}
