import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class back1057 {
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        int a = Integer.parseInt(st.nextToken());
        int player1 = Integer.parseInt(st.nextToken());
        int player2 = Integer.parseInt(st.nextToken());
        int round = 1;

        while (true) {

            if (a == 0) {
                break;
            }


            if (((player1 + 1) / 2) == ((player2 + 1) / 2)) {
                break;
            }


            player2 = (player2 + 1) / 2;
            player1 = (player1 + 1) / 2;
            a = a / 2;
            round++;
        }


        if (a == 0) {
            round = -1;
        }
        System.out.print(round);
    }
}
