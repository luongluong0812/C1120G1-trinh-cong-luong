package _12_collection_framework.bai_tap.bt1;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product p, Product p1) {
        int value=p.getPrice()-p1.getPrice();
        if(value>0){
            return 1;
        }else if(value==0){
            return 0;
        } else {
            return -1;
        }
    }
}
