import java.util.Random;
import java.util.Scanner;

public class pickgame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int p;
        while (true) {
            System.out.printf("경품을 추첨하겠습니까? : 1.(예) 0.(아니요) ");
            p = s.nextInt();
            if (p == 1) {
                int a = r.nextInt(100);
                if (a < 5) {
                    System.out.print("1등 여행티켓 당첨! \n");
                } else if (a < 15 && a > 4) {
                    System.out.print("2등 5만원 당첨! \n");
                } else if (a < 40 && a > 14) {
                    System.out.printf("3등 5천원 당첨 \n");
                } else {
                    System.out.printf("4등 물티슈 당첨! \n");
                }
            }
            if (p == 0) {
                System.out.printf("추첨을 그만두셨습니다.");
                return;
            }
        }
    }
}
