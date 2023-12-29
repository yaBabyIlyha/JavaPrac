//Вывести на экран аргументы командной строки в цикле for
public class Learn {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + i + ": " + args[i]);
        }
    }
}

