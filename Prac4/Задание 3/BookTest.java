public class BookTest {
    public static void main(String[] args){
        Book book = new Book("Гоголь", "Война и мир", 1863);
        System.out.println("Автор: " + book.getAuthor() + "\nНазвание: " + book.getBookName() + "\nГод: " + book.getYear());
    }
}
