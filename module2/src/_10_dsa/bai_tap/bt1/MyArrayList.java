package _10_dsa.bai_tap.bt1;

import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    //suc chua mac dinh la 10

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
           throw new IllegalArgumentException("capacity"+capacity);
        }
    }
    public int size(){
        return this.size;
    }
    public void clear(){
        size=0;
        for (int i=0;i<elements.length;i++){
            elements[i]=null;
        }
    }
    public boolean add(E element) throws IllegalAccessException {
        if (elements.length == size) {
           ensureCapacity(5);
        }

        elements[size]=element;
        size++;

        return true;
    }
    public void ensureCapacity(int minCapacity)  {
        if(minCapacity>=0){
            int newSize=this.elements.length+minCapacity;
            elements= Arrays.copyOf(elements,newSize);
        } else {
            try {
                throw new IllegalAccessException("minCapacity"+minCapacity);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
    public void add(E element,int index) throws IllegalAccessException {
        if(index>elements.length){
            throw  new IllegalAccessException("index"+index);
        } else if(elements.length==size){
            this.ensureCapacity(5);
        }else if (elements[index]==null){
            elements[index]=elements;
            size++;
        } else {
            for (int i=size+1;i>=index;i--){
                elements[i]=elements[i-1];
            }
            elements[index]=element;
            size++;
        }
    }
}