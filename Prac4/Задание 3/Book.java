public class Book {
    private String Author;
    private String bookName;
    private int year;

    public Book(String Author, String bookName, int year){
        this.Author = Author;
        this.bookName = bookName;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return Author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
