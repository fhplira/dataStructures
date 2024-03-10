package com.projects.ade;

import com.projects.ade.MyQueue;

public class QueueImplementation implements MyQueue {

    private Node front;
    private Node rear;
    private int size;

    public void offer(int element) {

        Node newNode = new Node(element);

        if (this.size == 0) {
            this.front = newNode;
            this.rear = newNode;
        }

        this.rear.setNext(newNode);
        this.rear = newNode;

        this.size++;
    }

    public int peek() {

        validateEmptyQueue();

        return this.rear.getValue();
    }

    public int poll() {

        validateEmptyQueue();

        int frontValue = this.front.getValue();
        Node frontNext = this.front.getNext();
        this.front = frontNext;

        this.size--;
        return frontValue;
    }

    public int getSize() {
        return this.size;
    }

    private class Node {

        private int value;
        private Node next;

        public Node (int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
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
