import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class back2908 {
    public static void main(String[] args) throws IOException {

        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer s = new StringTokenizer(b.readLine()," ");

        int a = Integer.parseInt(new StringBuilder(s.nextToken()).reverse().toString());
        int c = Integer.parseInt(new StringBuilder(s.nextToken()).reverse().toString());

        System.out.print(a > c ? a:c);

    }
}
