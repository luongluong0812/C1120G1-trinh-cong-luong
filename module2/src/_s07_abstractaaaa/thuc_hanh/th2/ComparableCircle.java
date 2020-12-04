package _s07_abstractaaaa.thuc_hanh.th2;

import _06_ke_thua.bai_tap2.Circle;

public class ComparableCircle extends Circle implements Comparable {
    public ComparableCircle(){

    }

    public ComparableCircle(float radius, String color) {
        super(radius, color);
    }


    public int compareTo(ComparableCircle o) {
        super.compareTo();
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}

