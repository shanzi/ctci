package me.exercise;

import java.util.Stack;

/**
 * Created by Chase_Zhang on 12/7/14.
 */
public class Ex4 {
    // hannoi tower


    public class HannoiTowers {
        Stack<Integer>[] towers;

        public HannoiTowers(int size) {
            towers = new Stack[3];

            towers[0] = new Stack<Integer>();
            towers[1] = new Stack<Integer>();
            towers[2] = new Stack<Integer>();

            for (int i = size; i > 0 ; i--) {
                towers[0].push(i);
            }
        }

        public void startMove() {
            moveDisks(towers[0].size(), towers[0], towers[2], towers[1]);
        }

        public void moveDisks(int n, Stack<Integer> start, Stack<Integer> to, Stack<Integer> buff) {
            if (n > 1) {
                moveDisks(n-1, start, buff, to);
                moveDisks(1, start, to, buff);
                moveDisks(n-1, buff, to, start);
            } else {
                int disk = start.pop();
                to.push(disk);
                checkState();
            }
        }

        private void checkState() {
            for (int i = 0; i < 3; i++) {
                Stack<Integer> stack = towers[i];
                for (int j = 0; j < stack.size() - 1; j++) {
                    assert(stack.elementAt(i) > stack.elementAt(i+1));
                }
            }
        }
    }

    public HannoiTowers createHannoiTowers(int size) {
        return new HannoiTowers(size);
    }
}
