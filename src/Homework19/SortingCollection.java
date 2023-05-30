package Homework19;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SortingCollection {
    public static void main(String[] args) {
        PriorityQueue<Integer> theQueue = new PriorityQueue<>();
        theQueue.add(-3);
        theQueue.add(8);
        theQueue.add(25);
        theQueue.add(0);
        while (!theQueue.isEmpty()) {
            System.out.println(theQueue.poll());
        }
        theQueue.clear();
        PriorityQueue<String> theQueue1 = new PriorityQueue<>();
        theQueue1.add("green");
        theQueue1.add("yellow");
        theQueue1.add("rEd");
        theQueue1.add("blue");
        while (!theQueue1.isEmpty()) {
            System.out.println(theQueue1.poll());
        }
        theQueue1.clear();
    }
}

