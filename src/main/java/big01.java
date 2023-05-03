import java.util.Scanner;

public class big01 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        for (int i = 1; i < a + 1; i++) {
            int b = s.nextInt();
            int c = s.nextInt();

            System.out.println("Case #" + i + ": " + b + " + " + c + " = " + (b + c));
        }
    }
}
