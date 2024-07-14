package com.projects.ade;

public interface MyList<T> {

    //Get an element in a specific position
    T getElement(int index);

    //Adds an element at the end of the list
    void add(T element);

    //Adds an element at any position of the list
    void add(T element, int index);

    //Removes an element at a specific position
    void remove(int index);

    //Substitutes an element of the list for any other
    void replace(T element, int index);

    //Gets the size of the queue
    int getSize();


}
