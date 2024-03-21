package com.projects.ade;

public interface MyList {

    //Get an element in a specific position
    int getElement(int index);

    //Adds an element at the end of the list
    void add(int element);

    //Adds an element at any position of the list
    void add(int element, int index);

    //Removes an element at a specific position
    void remove(int index);

    //Substitutes an element of the list for any other
    void replace(int element, int index);

    //Gets the size of the queue
    int getSize();


}
