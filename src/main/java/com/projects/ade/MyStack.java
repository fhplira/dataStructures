package com.projects.ade;

public interface MyStack {

    //Adds an element to the top
    void push(int element);

    //Gets the top element without removing it
    int peek();

    //Gets the top element and removes it
    int pop();

    //Gets the number of elements in the stack
    int getSize();

}
