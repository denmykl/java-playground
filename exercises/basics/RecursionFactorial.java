package basics;

public class RecursionFactorial {

    public static int power(int num, int n) {
        if (n == 0) return 1;
        return num * power(num, n - 1);
    }


    public static void main(String[] args) {

        System.out.println(power(3, 4));


    }
}
