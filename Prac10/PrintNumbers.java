import java.util.Scanner;
public class PrintNumbers {

    private static void printNumbers(int a, int b) {
        if (a < b) {
            System.out.print(a + " ");
            printNumbers(a + 1, b);
        } else if (a > b) {
            System.out.print(a + " ");
            printNumbers(a - 1, b);
        } else {
            System.out.print(a);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число A:");
        int a = scanner.nextInt();

        System.out.println("Введите число B:");
        int b = scanner.nextInt();

        System.out.println("Числа от A до B:");
        printNumbers(a, b);

        scanner.close();
    }
}