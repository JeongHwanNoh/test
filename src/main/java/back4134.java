import java.math.BigInteger;
import java.util.Scanner;


public class back4134 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();


        for (int i = 0; i < a; i++) {
            BigInteger b = scanner.nextBigInteger();

            if (b.isProbablePrime(10)) {
                System.out.println(b);
            } else {
                System.out.println(b.nextProbablePrime());
            }
        }

    }
}