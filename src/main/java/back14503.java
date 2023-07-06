import java.util.*;
import java.io.*;

public class back14503 {

    static int a, b;
    static int r, c, d;
    static int[][] map;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        a = Integer.parseInt(st.nextToken()); // 세로 크기
        b = Integer.parseInt(st.nextToken()); // 가로 크기

        st = new StringTokenizer(br.readLine(), " ");
        r = Integer.parseInt(st.nextToken()); // 좌표 초깃값
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken()); // 초기 방향

        map = new int[a][b];
        for(int i=0; i<a; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<b; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        ans = 0;
        clean(r, c, d);

        System.out.println(ans);
    }

    static void clean(int x, int y, int dir) {
        // 현재 위치 청소
        if(map[x][y] == 0) {
            map[x][y] = 2; // 청소한 자리는 2를 넣음
            ans++; // 청소한 위치 카운트
        }

        // 왼쪽 방향부터 탐색
        boolean beAbleToClean = false; // 청소할 수 있는 위치인지 체크하는 변수
        int nowDir = dir;

        for(int i=0; i<4; i++) {
            int nDir = (dir + 3) % 4; // 시계 방향으로 북동남서(0123)이기 때문에 +3을 해주고 4로 나눔
            //-> 반시계 방향으로 돌면서 탐색하는 것과 같음
            int nx = x + dx[nDir];
            int ny = y + dy[nDir];

            // 청소할 수 있는 위치 이면
            if(map[nx][ny] == 0) {
                clean(nx, ny, nDir); // 왼쪽 위치를 파라미터로 넘김
                beAbleToClean = true;
                break;
            }

            dir = nDir;
        }

        // 네 방향 모두 이미 청소됐거나 벽일 때
        if(!beAbleToClean) {
            int nDir = (dir + 2) % 4; // 후진함
            int nx = x + dx[nDir];
            int ny = y + dy[nDir];

            // 후진 한 위치가 벽이 아니면 탐색 시작
            if(map[nx][ny] != 1) {
                clean(nx, ny, nowDir); // 방향 유지한 채 후진 한 위치를 파라미터로 넘김
            }
        }

    }

}
