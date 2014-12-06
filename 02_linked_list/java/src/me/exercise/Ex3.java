package me.exercise;

/**
 * Created by Chase_Zhang on 12/6/14.
 */
public class Ex3 {
    // delete a node with pointer point to it

    public void deleteCurrrentNode(LinkedListNode node) throws Exception{
        if (node.next != null) {
            node.data = node.next.data;
            node.next = node.next.next;
        } else {
            throw new Exception("Can not delete the last element");
        }
    }
}
