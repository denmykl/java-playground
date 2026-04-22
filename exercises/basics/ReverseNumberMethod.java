package basics;

public class ReverseNumberMethod {

    public static int reverse(int number){

        int n = 0;
        int result = 0;

        while (number > 0){
            n = number % 10;
            result = result * 10 + n;
            number /= 10;
        }
        return result;
    }
    public static void main(){
        System.out.println(reverse(234));
    }
}
