package com.projects.ade;

public interface MyQueue<T> {

    //Adds an element at the end of the queue
    public void offer(T element);

    //Gets the front element without removing it
    public T peek();

    //Gets the front element and removes it
    public T poll();

    //Gets the size list
    public int getSize();

}
