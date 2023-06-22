import java.util.Scanner;
public class back2675 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        for(int i = 0; i < a; i++) {

            int b = s.nextInt();
            String c = s.next();

            for(int j = 0; j < c.length(); j++) {
                for(int k = 0; k < b; k++) {
                    System.out.print(c.charAt(j));
                }
            }

            System.out.println();
        }
    }
}