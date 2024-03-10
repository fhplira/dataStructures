package com.projects.ade;

public class MyArrayList implements MyList {

    private int[] array;
    private int listSize;

    public MyArrayList() {
        this.array = new int[10];
        this.listSize = 0;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getListSize() {
        return listSize;
    }

    public void setListSize(int listSize) {
        this.listSize = listSize;
    }

    @Override
    public int getElement(int index) {

        if(index > listSize || index < 0){
            throw new RuntimeException("Index out of bounds");
        }

        int element = this.array[index];
        return element;
    }

    @Override
    public void add(int element) {

        if(this.array.length <= this.listSize) {
            duplicateArray();
        }

        this.array[listSize] = element;
        this.listSize++;
    }

    private void duplicateArray() {
        int [] newArray = new int[this.array.length * 2];

        for(int i = 0; i < this.array.length; i++){
            newArray[i] = this.array[i];
        }

        this.array = newArray;
    }

    @Override
    public void add(int element, int index) {

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
    public void replace(int element, int index) {

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
