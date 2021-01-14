package test;

import java.util.Scanner;

public class Book {
    private String name;
    private String author;
    private String dateOfSale;
    private String dateOfPublication;
    private String producer;

    public Book() {
    }

    public Book(String name, String author, String dateOfSale, String dateOfPublication, String producer) {
        this.name = name;
        this.author = author;
        this.dateOfSale = dateOfSale;
        this.dateOfPublication = dateOfPublication;
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(String dateOfSale) {
        this.dateOfSale = dateOfSale;
    }

    public String getDateOfPublication() {
        return dateOfPublication;
    }

    public void setDateOfPublication(String dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
    public void input(){
        Scanner input=new Scanner(System.in);
        System.out.println("name?");
        name=input.nextLine();
        System.out.println("author?");
        author=input.nextLine();
        System.out.println("dateOfSale?");
        dateOfSale=input.nextLine();
        System.out.println("dateOfPublication?");
        dateOfPublication=input.nextLine();
        System.out.println("producer?");
        producer=input.nextLine();
    }

    @Override
    public String toString() {
        return name + "," + author + "," + dateOfSale + "," + dateOfPublication + "," + producer ;
    }
    public void showInfo(){
        System.out.println(toString());
    }
}
