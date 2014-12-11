package me.exercise;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Ex6Test {

    @Test
    public void testGenerateParens() throws Exception {
        ArrayList<String> list1 = Ex6.generateParens(10);
        ArrayList<String> list2 = Ex6.genParens(10);

        assertEquals(list2.size(), list1.size());

    }
}