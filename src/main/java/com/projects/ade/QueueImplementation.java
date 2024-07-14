package com.projects.ade;

import com.projects.ade.MyQueue;

public class QueueImplementation<T> implements MyQueue<T> {

    private Node front;
    private Node rear;
    private int size;

    public void offer(T element) {

        Node newNode = new Node(element);

        if (this.size == 0) {
            this.front = newNode;
            this.rear = newNode;
        }

        this.rear.setNext(newNode);
        this.rear = newNode;

        this.size++;
    }

    public T peek() {

        validateEmptyQueue();

        return this.front.getValue();
    }

    public T poll() {

        validateEmptyQueue();

        T frontValue = this.front.getValue();
        Node frontNext = this.front.getNext();
        this.front = frontNext;

        this.size--;
        return frontValue;
    }

    public int getSize() {
        return this.size;
    }

    private class Node {

        private T value;
        private Node next;

        public Node (T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private void validateEmptyQueue() {
        if (this.front == null) {
            throw new RuntimeException("Empty Queue");
        }
    }


}
