import java.util.Scanner;
import java.util.StringTokenizer;

public class back1541 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int sum = Integer.MAX_VALUE;
        StringTokenizer s = new StringTokenizer(in.nextLine(), "-");

        while (s.hasMoreTokens()) {
            int temp = 0;

            StringTokenizer a = new StringTokenizer(s.nextToken(), "+");

            while (a.hasMoreTokens()) {
                temp = temp + Integer.parseInt(a.nextToken());
            }

            if (sum == Integer.MAX_VALUE) {
                sum = temp;
            } else {
                sum = sum - temp;
            }
        }
        System.out.println(sum);
    }
}