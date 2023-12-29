/*
   Сгенерировать массив целых чисел случайным образом, вывести его
   на экран, отсортировать его, и снова вывести на экран.
*/
import java.util.Random;
public class Learn{
    public static void main(String args[]){
        Random random = new Random();
        int[] myArray = new int[10];
        for(int i = 0; i < myArray.length; i++){
            myArray[i] = random.nextInt(100);
        }


        printArray(myArray);
        bubbleSort(myArray);
        printArray(myArray);
    }


    public static void bubbleSort(int[] array){
        int n = array.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


    public static void printArray(int[] array){
        for (int number : array){
            System.out.print(number + " " );
        }
        System.out.println();
    }
}

