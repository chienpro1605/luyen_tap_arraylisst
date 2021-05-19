package phuong_thuc_arraylist;

import java.util.Arrays;

public class Mylist<T> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private T[] data;

    public Mylist(){
        data = (T[]) new Object[DEFAULT_CAPACITY];
    }
    public Mylist(int size){
        data = (T[]) new Object[size];
    }
    private void ensuracapa(){
        if (size>data.length){
            int biggerSize = size*2 + 1;
            data = Arrays.copyOf(data,biggerSize);
        }
    }
    public void add(T e){
        size = size+1;
        ensuracapa();
        data[size-1] = e;
    }



}
