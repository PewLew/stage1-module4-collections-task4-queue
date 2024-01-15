package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addLast(firstQueue.poll());
        deque.addLast(firstQueue.poll());
        deque.addLast(secondQueue.poll());
        deque.addLast(secondQueue.poll());
        while(!firstQueue.isEmpty() && !secondQueue.isEmpty()){
            firstQueue.add(deque.pollFirst());
            secondQueue.add(deque.pollFirst());
            deque.offerLast(firstQueue.poll());
            deque.offerLast(firstQueue.poll());
            deque.offerLast(secondQueue.poll());
            deque.offerLast(secondQueue.poll());
        }

        return deque;
    }
}
