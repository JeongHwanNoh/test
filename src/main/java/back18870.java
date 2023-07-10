import java.io.*;
import java.util.*;

public class back18870 {

    public static void main(String args[]) throws IOException{
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder s = new StringBuilder();

        int num = Integer.parseInt(b.readLine());

        String[] arr = b.readLine().split(" ");
        int[] an = new int[num];
        int cnt = 0;

        for(int i = 0 ; i < arr.length ; i ++)
            an[i] = Integer.parseInt(arr[i]);

        int[] temp = an.clone();

        Arrays.sort(an);

        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i = 0 ; i < an.length ; i++) {
            if(!hmap.containsKey(an[i]))
                hmap.put(an[i], cnt++);
        }

        for(int i = 0; i < num ; i++) {
            s.append(hmap.get(temp[i])).append(" ");
        }

        System.out.println(s.toString());
    }
}
