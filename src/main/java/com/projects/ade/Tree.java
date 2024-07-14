package com.projects.ade;

public interface Tree<T> {

    //Adds an element to the tree
    public void add(T element);

    //Checks if an element is present in the tree
    public boolean contains(T element);

    //Removes an element from the tree
    public void remove(T element);

}
