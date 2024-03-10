package com.projects.ade;

public interface MyList {

    //Get an element in a specific position
    int getElement(int index);

    //Add an element at the end of the list
    void add(int element);

    //Add an element at any position of the list
    void add(int element, int index);

    //Remove an element at a specific position
    void remove(int index);

    //Substitute an element of the list for any other
    void replace(int element, int index);

    //Get the size of the list
    int getSize();


}
