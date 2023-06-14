import java.util.Scanner;

public class back2738 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        int[][] arr1 = new int[a][b];
        int[][] arr2 = new int[a][b];

        for(int i=0; i<a; i++) {
            for(int j=0; j<b; j++) {
                arr1[i][j] = s.nextInt();
            }
        }
        for(int i=0; i<a; i++) {
            for(int j=0; j<b; j++) {
                arr2[i][j] = s.nextInt();
            }
        }
        int sum = 0;

        for(int i=0; i<a; i++) {
            for(int j=0; j<b; j++) {
                sum = arr1[i][j]+ arr2[i][j];
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}