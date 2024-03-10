package com.projects.ade;

public class StackImplementation implements MyStack {

    private Node top;
    private int size;

    public void push(int element) {

        Node node = new Node(element);

        node.setNext(this.top);
        this.top = node;

        this.size++;
    }

    public int pop() {

        validateEmptyStack();

        int value = this.top.getValue();
        this.top = top.getNext();

        this.size--;

        return value;
    }

    public int peek() {

        validateEmptyStack();

        return this.top.getValue();
    }

    public int getSize() {
        return this.size;
    }

    private class Node {

        int value;
        Node next;

        public Node(int value) {
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

    private void validateEmptyStack() {
        if (this.top == null) {
            throw new RuntimeException("Empty Stack");
        }
    }

}
