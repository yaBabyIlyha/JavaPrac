//№4
public class sum{
    private static int Sum(int n){
        if (n == 0)
            return 0;
        else
            return n % 10 + Sum(n/10);
    }

    public static void main(String[] args){
        int n = 123;
        System.out.println(Sum(n));
    }
}

