package Inheritance;

public class Book {
    private int isbn;
    private String title;
    private String author;
    private String publisher;
    private double price;

    public Book(){
        //default constructor
    }

    public Book(int isbn, String title, String author, String publisher, double price){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    // private member variables are hidden inside object which cannot be accesed from outside
    // getter and seter methods are used to provide read and write access respectively

    public int getIsbn(){
        return isbn;
    }

    public void setIsbn(int isbn){
        this.isbn = isbn;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle( String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }
    public String getPublisher(){
        return publisher;
    }

    public void setPublisher(String p){

        this.publisher = publisher;
    }
    public double getPrice(Double price){
        return price;
    }

    public void setPrice(){
        this.price = price;
    }
}
