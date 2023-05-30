import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class back11659 {
    static int n;
    static int m;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(b.readLine());

        n = Integer.parseInt(s.nextToken());
        m = Integer.parseInt(s.nextToken());
        arr = new int[n + 1];
        s = new StringTokenizer(b.readLine());

        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i - 1] + Integer.parseInt(s.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            s = new StringTokenizer(b.readLine());
            int a = Integer.parseInt(s.nextToken());
            int c = Integer.parseInt(s.nextToken());
            if (a == 1) {
                sb.append(arr[c]).append('\n');
            } else
                sb.append(arr[c] - arr[a - 1]).append('\n');
        }
        System.out.println(sb);
    }
}
