package com.projects.ade;

public interface MyStack<T> {

    //Adds an element to the top
    void push(T element);

    //Gets the top element without removing it
    T peek();

    //Gets the top element and removes it
    T pop();

    //Gets the number of elements in the stack
    int getSize();

}
