package basics;

public class MultiplicationTable {
    static void main(String[] args) {

        for (int i = 2; i <= 10; i++) {

            System.out.println("--- MULTIPLICATION TABLE OF NUMBER " + i + " ---");

            for (int y = 1; y <= 10; y++) {
                System.out.printf("%d * %d = %d\n", i, y, i * y);
            }
        }
    }
}