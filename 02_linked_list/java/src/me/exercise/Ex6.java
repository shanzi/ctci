package me.exercise;

/**
 * Created by Chase_Zhang on 12/6/14.
 */
public class Ex6 {
    // find loop in linked list

    public LinkedListNode findLoopStart(LinkedList list) {
        LinkedListNode fastRunner = list.head;
        LinkedListNode slowRunner = list.head;

        while (fastRunner != null) {
            if (fastRunner.next == null) return null;
            if (fastRunner.next.next == null) return null;

            fastRunner = fastRunner.next.next;
            slowRunner = slowRunner.next;

            if (fastRunner == slowRunner) {
                break;
            }
        }

        LinkedListNode stepRunner = list.head;
        while (stepRunner != slowRunner) {
            stepRunner = stepRunner.next;
            slowRunner = slowRunner.next;
        }
        return stepRunner;
    }
}
