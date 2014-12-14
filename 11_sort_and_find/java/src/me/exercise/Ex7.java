package me.exercise;

/**
 * Created by Chase_Zhang on 12/14/14.
 */
public class Ex7 {
    private static Node root;

    public static class Node {
        int value;
        int leftSize = 0;
        int count = 1;
        Node left = null;
        Node right = null;

        public Node(int value) {
            this.value = value;
        }
    }

    private static void insertValue(int value, Node rt) {
        if (value == rt.value) {
           rt.count++;
        } else if (value < rt.value) {
            if (rt.left != null) insertValue(value, rt.left);
            else rt.left = new Node(value);
            rt.leftSize += 1;
        } else {
            if (rt.right != null) insertValue(value, rt.right);
            else rt.right = new Node(value);
        }
    }

    public static void insertValue(int value) {
        if (root == null) root = new Node(value);
        else insertValue(value, root);
    }

    public static int getRank(int value) {
        Node current = root;
        int count = 0;
        while (current != null) {
            if (value == current.value) {
                count += current.leftSize;
                break;
            }
            else if (value < current.value) current = current.left;
            else {
                count += current.leftSize + current.count;
                current = current.right;
            }
        }

        return count;
    }
}
