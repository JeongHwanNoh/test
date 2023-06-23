import java.util.*;

public class back1068 {

    static int n, d;
    static int[] parent;
    static int count;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        parent = new int[n];
        int a = 0;
        for(int i = 0; i < n; i++) {
            parent[i] = s.nextInt();
            if(parent[i] == -1) a = i;
        }
        d = s.nextInt();

        deleteNode(d);

        count = 0;
        visited = new boolean[n];
        countLeaf(a);

        System.out.println(count);
    }

    public static void deleteNode(int d) {
        parent[d] = -2;
        for(int i = 0; i < n; i++) {
            if(parent[i] == d) {
                deleteNode(i);
            }
        }
    }

    public static void countLeaf(int s) {
        boolean isLeaf = true;
        visited[s] = true;
        if(parent[s] != -2) {
            for(int i = 0; i < n; i++) {
                if(parent[i] == s && visited[i] == false) {
                    countLeaf(i);
                    isLeaf = false;
                }
            }
            if(isLeaf) count++;
        }
    }
}


