package _17_io_binaryfile.bai_tap.bt1;

import java.io.Serializable;
import java.util.Scanner;

public class Product implements Serializable {

    private String id;
    private String name;
    private String creatAt;
    private String price;
    private String description;

    public Product() {
    }

    public Product(String id, String name, String creatAt, String price, String description) {
        this.id = id;
        this.name = name;
        this.creatAt = creatAt;
        this.price = price;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreatAt() {
        return creatAt;
    }

    public void setCreatAt(String creatAt) {
        this.creatAt = creatAt;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return "Product{" +

                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", creatAt='" + creatAt + '\'' +
                ", price='" + price + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
    public void display(){
        System.out.println(toString());
    }
}
