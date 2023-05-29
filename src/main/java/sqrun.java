import java.util.Scanner;

    public class sqrun {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();

            int x = Math.min(a, c-b);
            int y = Math.min(b, d-b);

            System.out.println(Math.min(x, y));
        }

    }

