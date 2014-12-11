package me.exercise;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Ex4Test {

    ArrayList<Integer> makeSet(int length) {
        ArrayList<Integer> set = new ArrayList<Integer>();
        for (int i = 0; i < length; i++) {
            set.add(i);
        }
        return set;
    }

    @Test
    public void testGetAllSubsets() throws Exception {
        ArrayList<Integer> set = makeSet(10);
        ArrayList<ArrayList<Integer>> allSubset = Ex4.getAllSubsets(set);

        assertEquals(1024, allSubset.size());
    }

    @Test
    public void testGetAllSubsetsBinary() throws Exception {
        ArrayList<Integer> set = makeSet(10);
        ArrayList<ArrayList<Integer>> allSubset = Ex4.getAllSubsetsBinary(set);

        assertEquals(1024, allSubset.size());
    }
}