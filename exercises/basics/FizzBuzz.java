package basics;

public class FizzBuzz {

    public static String fizzbuzz(int num){
        if (num % 5 == 0 && num % 3 == 0){
            return "FizzBuzz";
        } else if (num % 5 == 0) {
            return "Buzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else {
            return String.valueOf(num);
        }
    }

    public static void main(String[] args) {

        System.out.println(fizzbuzz(3));
        System.out.println(fizzbuzz(5));
        System.out.println(fizzbuzz(15));
        System.out.println(fizzbuzz(7));

    }

}