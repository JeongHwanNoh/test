import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[5];
        int c = 0;

        System.out.printf("");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();

            for (int b = 0; b < i; b++) {
                if (a[i] == a[b]) {
                    System.out.printf("중복이 있어 다시 시도하세요");
                    c = 1;
                }
            }
        }
        if (c == 0) {

            for (int i = 0; i < a.length - 1; i++) {
                int m = i;

                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] < a[m]) {
                        m = j;
                    }
                }
                int temp = a[i];
                a[i] = a[m];
                a[m] = temp;
            }
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]);
            }
        }
    }
}