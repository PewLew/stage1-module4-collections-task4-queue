package com.epam.collections.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> queuee = new PriorityQueue<>(Comparator.reverseOrder());
        queuee.addAll(firstList);
        queuee.addAll(secondList);
        return  queuee;
    }
}
