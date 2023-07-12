import java.io.*;
import java.util.*;

public class back10974 {

    private static int N;
    private static int[] a;
    private static boolean[] visited;
    private static int[] output;

    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        a = new int[N];
        visited = new boolean[N];
        output = new int[N];

        for(int i=0; i<N; i++){
            a[i] = i+1;
        }

        permutation(0);

        bw.flush();
        bw.close();
        br.close();
    }

    private static void permutation(int depth){
        if(depth == N){
            print(output);
            return;
        }

        for(int i=0; i<N; i++){
            if(visited[i] != true){
                visited[i] = true;
                output[depth] = a[i];
                permutation(depth+1);
                visited[i] = false;
            }
        }
    }

    private static void print(int[] arr){
        for(int i=0; i<N; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
