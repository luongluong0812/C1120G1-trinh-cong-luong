package youtube.test_text;

public class Book {
    private  String id;
    private String name;
    private  String creatAt;

    public Book() {
    }

    public Book(String id, String name, String creatAt) {
        this.id = id;
        this.name = name;
        this.creatAt = creatAt;
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

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", creatAt='" + creatAt + '\'' +
                '}';
    }
}
