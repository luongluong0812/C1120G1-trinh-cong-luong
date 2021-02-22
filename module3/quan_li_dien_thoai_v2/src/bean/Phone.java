package bean;

public class Phone {
    Integer id;
    String name;
    int price;
    String color;

    public Phone() {
    }

    public Phone(Integer id, String name, int price, String color) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
