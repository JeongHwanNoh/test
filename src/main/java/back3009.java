import java.util.Scanner;

    public class back3009 {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            int[] c1 = { in.nextInt(), in.nextInt() };
            int[] c2 = { in.nextInt(), in.nextInt() };
            int[] c3 = { in.nextInt(), in.nextInt() };


            in.close();

            int x;
            int y;

            if (c1[0] == c2[0]) {
                x = c3[0];
            }
            else if (c1[0] == c2[0]) {
                x = c2[0];
            }
            else {
                x = c1[0];
            }
            if (c1[1] == c2[1]) {
                y = c3[1];
            }
            else if (c1[1] == c3[1]) {
                y = c2[1];
            }
            else {
                y = c1[1];
            }

            System.out.println(x + " " + y);

        }
}
