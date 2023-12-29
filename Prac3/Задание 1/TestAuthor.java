package prac2.ex1;

public class TestAuthor {
    public static void main(String[] args){
        Author a1 = new Author("Ivan Ivanov", "ivanov@gmail.com", 'm');
        Author a2 = new Author("Daniil Kuznetsov", "kuznetsov@mail.ru", 'm');
        Author a3 = new Author("Anna Kuphenko", "-", 'f');a3.setEmail("kupchenko@gmail.com");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
