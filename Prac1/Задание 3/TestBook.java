package prac1.book;

public class TestBook {
    public static void main(String[] args){
        Book b1 = new Book(1111,"Шерлок Холмс", "Конан Дойль");
        Book b2 = new Book(1213,"Судьба человека"); b2.setAuthor("Михаил Шолохов");
        Book b3 = new Book("Шерлок Холмс", "Конан Дойль");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
