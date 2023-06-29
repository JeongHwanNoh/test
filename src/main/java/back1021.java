import java.util.*;
import java.io.*;

public class back1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        LinkedList<Integer> deque=new LinkedList<>();

        int cnt=0;

        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());

        for(int i=1; i<=n; i++){
            deque.offer(i);
        }

        int sel[]=new int[n];

        st=new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){
            sel[i]=Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<m; i++){
            int target=deque.indexOf(sel[i]);
            int half;

            if(deque.size()%2==0){
                half=deque.size()/2-1;
            }else{
                half=deque.size()/2;
            }

            if(target<=half){
                for(int j=0; j<target; j++){
                    int tmp=deque.pollFirst();
                    deque.offerLast(tmp);
                    cnt++;
                }
            }else{
                for(int j=0; j<deque.size()-target; j++){
                    int tmp=deque.pollLast();
                    deque.offerFirst(tmp);
                    cnt++;
                }
            }
            deque.pollFirst();
        }
        System.out.println(cnt);
    }
}