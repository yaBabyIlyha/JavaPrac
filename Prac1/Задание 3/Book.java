package prac1.book;

public class Book {
    private int id;
    private String name;
    private String author;

    public Book(int i, String n, String a){
        id = i;
        name = n;
        author = a;
    }

    public Book(int i, String n){
        id = i;
        name = n;
        author = "unknown";
    }
    public Book(String n, String a){
        id = 0;
        name = n;
        author = a;
    }
    public String getName(){
        return name;
    }
    public void setAuthor(String a){
        author = a;
    }
    public String toString(){
        return "\n\nID: " + id + "\nName: " + name + "\nAuthor: " + author;
    }
}
