//Создать метод, вычисляющую факториал числа с помощью цикла, проверить работу метода.
public class Learn {
    public static void main(String args[]){
        System.out.println(findFactorial(6));
    }


    public static int findFactorial(int number){
        int temp = 1;
        for (int i = number; i != 0; i--){
            temp *= i;
        }
        return temp;
    }
}

