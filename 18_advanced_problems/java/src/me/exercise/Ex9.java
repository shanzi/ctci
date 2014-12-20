package me.exercise;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by Chase_Zhang on 12/20/14.
 */

class HeapComparator implements Comparator<Integer> {
    int reverseFactor;

    public HeapComparator() {
        reverseFactor = 1;
    }

    public HeapComparator(boolean reverse) {
        reverseFactor = reverse ? -1 : 1;
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        return reverseFactor * (o1.intValue() - o2.intValue());
    }
}

public class Ex9 {
    private PriorityQueue<Integer> minTopHeap = new PriorityQueue<Integer>(50, new HeapComparator());
    private PriorityQueue<Integer> maxTopHeap = new PriorityQueue<Integer>(50, new HeapComparator(true));

    public void add(int number) {
        if (minTopHeap.size() == maxTopHeap.size()) {
            if (minTopHeap.peek() != null && minTopHeap.peek() < number) {
                maxTopHeap.offer(minTopHeap.poll());
                minTopHeap.offer(number);
            } else {
                maxTopHeap.offer(number);
            }
        } else {
            if (maxTopHeap.peek() > number) {
                minTopHeap.offer(maxTopHeap.poll());
                maxTopHeap.offer(number);
            } else {
                minTopHeap.offer(number);
            }
        }
    }

    public double median() {
        if (maxTopHeap.isEmpty()) return 0;

        if (maxTopHeap.size() == minTopHeap.size()) {
            return (maxTopHeap.peek() + minTopHeap.peek()) * 0.5;
        } else {
            return maxTopHeap.peek();
        }
    }
}
