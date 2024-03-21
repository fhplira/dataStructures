package com.projects.ade;

public interface MyQueue {

    //Adds an element at the end of the queue
    public void offer(int element);

    //Gets the front element without removing it
    public int peek();

    //Gets the front element and removes it
    public int poll();

    //Gets the size list
    public int getSize();

}
