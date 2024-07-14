package com.projects.ade;

public class StackImplementation<T> implements MyStack<T> {

    private Node top;
    private int size;

    public void push(T element) {

        Node node = new Node(element);

        node.setNext(this.top);
        this.top = node;

        this.size++;
    }

    public T pop() {

        validateEmptyStack();

        T value = this.top.getValue();
        this.top = top.getNext();

        this.size--;

        return value;
    }

    public T peek() {

        validateEmptyStack();

        return this.top.getValue();
    }

    public int getSize() {
        return this.size;
    }

    private class Node {

        T value;
        Node next;

        public Node(T value) {
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

    private void validateEmptyStack() {
        if (this.top == null) {
            throw new RuntimeException("Empty Stack");
        }
    }

}
