import java.util.Scanner;

public class day20230816 {

    public static int a[];
    public static int N, M;
    public static StringBuilder s = new StringBuilder();

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        a = new int[M];

        dfs(0);
        System.out.print(s);

    }

    public static void dfs(int depth) {
        // 깊이가 M이랑 같아지면 출력후 return
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                s.append(a[i] + " ");
            }
            s.append('\n');
            return;
        }

        for (int i = 1; i <= N; i++) {
            a[depth] = i;
            dfs(depth + 1);
        }
    }

}

