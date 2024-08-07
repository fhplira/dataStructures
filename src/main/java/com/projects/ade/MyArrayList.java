package com.projects.ade;

public class MyArrayList<T> implements MyList<T> {

    private T[] array;
    private int listSize;

    public MyArrayList() {
        this.array = (T[]) new Object[10];
        this.listSize = 0;
    }

    @Override
    public T getElement(int index) {

        if(index > listSize || index < 0){
            throw new RuntimeException("Index out of bounds");
        }

        T element = this.array[index];
        return element;
    }

    @Override
    public void add(T element) {

        if(this.array.length <= this.listSize) {
            duplicateArray();
        }

        this.array[listSize] = element;
        this.listSize++;
    }

    private void duplicateArray() {
        T[] newArray = (T[]) new Object[this.array.length * 2];

        for(int i = 0; i < this.array.length; i++){
            newArray[i] = this.array[i];
        }

        this.array = newArray;
    }

    @Override
    public void add(T element, int index) {

        if(this.listSize - this.array.length >= 0){
            duplicateArray();
        }

        if(index > this.array.length || index < 0){
            throw new RuntimeException("Index out of bounds");
        }

        if(index < this.listSize) {
            for(int i = this.listSize; i >= index; i--){
                this.array[i + 1] = this.array[i];
            }
        }
        this.array[index] = element;
        this.listSize++;

    }

    @Override
    public void remove(int index) {

        if(index > this.array.length || index < 0){
            throw new RuntimeException("Index out of bounds");
        }

        if(index < this.listSize) {
            for(int i = index; i <= this.listSize; i++){
                this.array[i] = this.array[i + 1];
            }
        }
        this.listSize--;

    }

    @Override
    public void replace(T element, int index) {

        if(this.array.length - this.listSize >= 0){
            duplicateArray();
        }

        if(index > this.array.length || index < 0){
            throw new RuntimeException("Index out of bounds");
        }

        if(index < listSize) {
            for(int i = index; i <= listSize + 1; i++){
                this.array[index] = this.array[index + 1];
            }
        }
        this.array[index] = element;
        this.listSize++;

    }

    public int getSize() {
        return this.listSize;
    }
}
