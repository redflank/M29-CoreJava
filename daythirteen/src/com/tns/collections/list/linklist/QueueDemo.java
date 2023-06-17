package com.tns.collections.list.linklist;

import java.util.PriorityQueue;

public class QueueDemo {
    public QueueDemo() {
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue();
        pq.add(10);
        pq.add(40);
        pq.add(30);
        pq.add(20);
        pq.add(25);
        System.out.println(pq);
        System.out.println(pq.offer(12));
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println("---------------------");
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println("---------------------");
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
