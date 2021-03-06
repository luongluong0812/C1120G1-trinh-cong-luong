package bean;

public class Product {
    int id;
    String name;
    String color;

    public Product() {
    }

    public Product(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Product(int id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
