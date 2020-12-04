package _s10_list.demo;

import java.util.Arrays;

public class MyArrayList {
    private Object[] objArray;
    // kich thuoc hien tai
    private int currentSize;
    // suc chua toi da
    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        objArray = new Object[DEFAULT_CAPACITY];
    }

    public Object[] getObjArray() {
        return objArray;
    }

    public void setObjArray(Object[] objArray) {
        this.objArray = objArray;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public static int getDefaultCapacity() {
        return DEFAULT_CAPACITY;
    }

    public MyArrayList(int maxSize) {
        objArray = new Object[maxSize];
    }

    public void ensureCapacity() {
        int newLen = this.objArray.length +1;
        this.objArray = Arrays.copyOf(this.objArray, newLen);
    }

    public void add(Object e) {

        // ensureCapacity
        if (getCurrentSize() == getObjArray().length) {
            this.ensureCapacity();
        }

        objArray[this.currentSize++] = e;
    }

    public void displayList() {
//        System.out.println(Arrays.toString(this.objArray));
        for (int i = 0; i < this.currentSize; i++) {
            System.out.print(objArray[i] + " ");
        }
    }
}
