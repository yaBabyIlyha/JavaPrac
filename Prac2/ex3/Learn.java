//Вывести на экран первые 10 чисел гармонического ряда
public class Learn {
    public static void main(String[] args) {
        int n = 10; // Количество элементов, которые вы хотите вывести


        double harmonicSum = 0.0;
        for (int i = 1; i <= n; i++) {
            harmonicSum += 1.0 / i;
        }


        System.out.println("Первые " + n + " чисел гармонического ряда:");
        for (int i = 1; i <= n; i++) {
            System.out.print("1/" + i);
            if (i < n) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + harmonicSum);
    }
}

