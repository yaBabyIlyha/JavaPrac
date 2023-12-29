// Вывести на экран сумму чисел массива с помощью циклов for, while, do while.
public class Learn {
    public static void main(String[] arg){
        int[] myArray = new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int sum = 0;
        for (int i = 0; i < myArray.length; i++ ){
            sum+=myArray[i];
        }
        System.out.println("for: " + sum);


        sum = 0;
        int counter = 0;
        while(counter != myArray.length){
            sum+=myArray[counter];
            counter++;
        }
        System.out.println("while: " + sum);


        sum = 0;
        counter = 0;
        do{
            sum+=myArray[counter];
            counter++;
        } while(counter != myArray.length);
        System.out.println("do while: " + sum);
    }
}

