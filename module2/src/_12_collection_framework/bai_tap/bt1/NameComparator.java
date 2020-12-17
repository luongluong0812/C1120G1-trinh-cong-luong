package _12_collection_framework.bai_tap.bt1;

import java.util.Comparator;

public class NameComparator implements Comparator<Product> {
    @Override
    public int compare(Product p, Product p1) {
        int a = p.getName().compareTo(p1.getName());
        if (a > 0) {
            return 1;
        } else if (a == 0) {
            return 0;
        } else{ return -1;}
    }
}
