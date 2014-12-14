package me.exercise;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Ex6Test {

    Ex6.Person[] makePeople() {
        Ex6.Person[] people = new Ex6.Person[10];
        for (int i = 0; i < 5; i++) {
            int height = 150 + i;
            int weight = 50 + i;
            people[i] = new Ex6.Person(height, weight);
        }

        for (int i = 5; i < 10; i++) {
            int height = 165 - i;
            int weight = 65 - i;
            people[i] = new Ex6.Person(height, weight);
        }

        return people;
    }

    @Test
    public void testLongestIncreasingSeq() throws Exception {

        Ex6.Person[] people = makePeople();
        ArrayList<Ex6.Person>solution = Ex6.longestIncreasingSeq(people);
        assertEquals(10, solution.size());
    }
}