package com.projects.ade;

public class MyLinkedList implements MyList{

    private Node head;
    private Node tail;
    private int listSize;

    public MyLinkedList() {
        this.listSize = 0;
    }

    public int getElement(int index) {

        Node value = this.head;
        for (int i = 0; i < index; i++) {
            value = value.getNext();
        }

        return value.getValue();
    }

    public void add(int element) {

        Node node = new Node(element);

        if (this.listSize == 0) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.setNext(node);
            this.tail = node;

        }

        listSize++;

    }

    public void add(int element, int index) {

        validateIndex(index);
        Node node = new Node(element);

        if (index == 0) {
            node.setNext(this.head);
            this.head = node;
        } else {
            Node previous = getNode(index - 1);
            node.setNext(previous.getNext());
            previous.setNext(node);
        }

        listSize++;

    }

    public void remove(int index) {

        validateIndex(index);

        if (index == 0) {
            if (listSize == 1) {
                this.head = null;
                this.tail = null;
            }
            this.head = getNode(index + 1);
        } else {
            Node previous = getNode(index - 1);
            previous.setNext(getNode(index + 1));
        }

        listSize--;

    }

    public void replace(int element, int index) {

        validateIndex(index);

        Node node = new Node(element);

        if (listSize == 1) {
            this.head = node;
            this.tail = node;
        }
        node.setNext(getNode(index + 1));
        Node previous = getNode(index - 1);
        previous.setNext(node);

    }

    public int getSize() {
        return this.listSize;
    }

    private void validateIndex(int index) {
        if (index < 0 || index > this.listSize) {
            throw new RuntimeException("Index out of bounds: " + index);
        }
    }

    private Node getNode(int index) {

        Node node = this.head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node;
    }


    private class Node {
        private int value;
        private Node next;

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

    @Override
    public String toString() {
        String list = "[ ";
        for (int i = 0; i < listSize; i++) {
            list += getElement(i) + ",";
        }
        return list + "]";
    }
}
