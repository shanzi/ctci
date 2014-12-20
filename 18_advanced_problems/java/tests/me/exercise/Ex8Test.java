package me.exercise;

import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.*;

public class Ex8Test {

    int[] toArray(ArrayList<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    @Test
    public void testSearch() throws Exception {
        String s = "ReactiveCocoa is an implementation of functional reactive programming, for more information about FRP, see our philosophy page.";
        String[] t = {"Cocoa", "reactive", "programming", "i", "hello"};

        ArrayList<Integer>[] res = Ex8.search(s, t);
        int[] indexesCocoa = {8, };
        int[] indexesreactive = {49,};
        int[] indexesprograming = {58,};
        int[] indexi = {5, 14, 20, 31, 43, 54, 66, 80, 88, 113};
        assertArrayEquals(indexesCocoa, toArray(res[0]));
        assertArrayEquals(indexesreactive, toArray(res[1]));
        assertArrayEquals(indexesprograming, toArray(res[2]));
        assertArrayEquals(indexi, toArray(res[3]));
        assertNull(res[4]);
    }
}