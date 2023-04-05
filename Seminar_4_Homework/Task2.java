package Seminar_4_Homework;

import java.util.LinkedList;

public class Task2<T> {
    private LinkedList<T> queue = new LinkedList<T>();

    public void enqueue(T item) {
        queue.addLast(item);
    }

    public T dequeue() {
        return queue.poll();
    }

    public T first() {
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }
}
