package me.exercise;

import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class Ex4Test {

    private Ex4 ex4Solution;

    @Before
    public void setUp() throws Exception {
        ex4Solution = new Ex4();
    }

    @Test
    public void testMoveHannoi() throws Exception {
        Ex4.HannoiTowers towers8 = ex4Solution.createHannoiTowers(8);
        towers8.startMove();

        Stack<Integer>stack8 = towers8.towers[2];

        for (int i = 1; i <= 8; i++) {
            assertEquals(stack8.pop().intValue(), i);
        }

        Ex4.HannoiTowers towers9 = ex4Solution.createHannoiTowers(9);
        towers9.startMove();

        Stack<Integer>stack9 = towers9.towers[2];

        for (int i = 1; i <= 9; i++) {
            assertEquals(stack9.pop().intValue(), i);
        }
    }
}