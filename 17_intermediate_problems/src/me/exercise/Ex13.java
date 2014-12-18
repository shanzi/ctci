package me.exercise;

/**
 * Created by chase on 14-12-18.
 */
public class Ex13 {

    public static class BiNode {
        BiNode node1;
        BiNode node2;
        int data;
    }

    private static void insertNode(BiNode root, int data) {
        if (root.data > data) {
            if (root.node1 != null) {
                insertNode(root.node1, data);
            } else {
                root.node1 = new BiNode();
                root.node1.data = data;
            }
        } else if (root.data < data) {
            if (root.node2 != null) {
                insertNode(root.node2, data);
            } else {
                root.node2 = new BiNode();
                root.node2.data = data;
            }
        }
    }

    public static BiNode makeTree(int[] array) {
        BiNode root = new BiNode();
        root.data = array[0];
        for (int i = 1; i < array.length; i++) {
            insertNode(root, array[i]);
        }
        return root;
    }

    private static BiNode treeToLinkedList(BiNode root) {
        if (root == null) {
            return null;
        }

        BiNode part1 = treeToLinkedList(root.node1);
        BiNode part3 = treeToLinkedList(root.node2);

        BiNode tail3 = (part3 == null) ? null : part3.node1;

        if (part1 == null && part3 == null) {
            root.node1 = root;
            root.node2 = root;
            return root;
        }

        if (part1 == null) {
            part3.node1.node2 = root;
            root.node1 = part3.node1;
        } else {
            part1.node1.node2 = root;
            root.node1 = part1.node1;
        }

        if (part3 == null) {
            root.node2 = part1;
            part1.node1 = root;
        } else {
            root.node2 = part3;
            part3.node1 = root;
        }

        if (part1 != null && part3 != null) {
            tail3.node2 = part1;
            part1.node1 = tail3;
        }

        return part1 == null ? root : part1;
    }

    public static BiNode convert(BiNode root) {
        BiNode head = treeToLinkedList(root);
        head.node1.node2 = null;
        head.node1 = null;
        return head;
    }
}
