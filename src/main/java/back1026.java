import java.util.Arrays;
import java.util.Scanner;
public class back1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int[] a = new int[c];
        int[] b = new int[c];
        int result = 0;

        for (int i = 0; i < c; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < c; i++) {
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < c; i++) {
            result += a[i] * b[c-i-1];
        }
        System.out.println(result);
    }
}