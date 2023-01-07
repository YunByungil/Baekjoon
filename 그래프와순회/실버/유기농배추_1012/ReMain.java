package 그래프와순회.실버.유기농배추_1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReMain {
    public static int n, m; // 세로, 가로
    public static boolean[][] visited, arr; // 배추밭을 방문했는지 여부, 배추가 심어져있는 배열

    public static int result; // 지렁이 개수

    public static int[] col = {0, 0, 1, -1}; // (0, 0)의 배추밭을 들어갔으면 상, 하, 좌, 우 이어져있는 배추가 있는지 확인하기 위함
    public static int[] row = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        // 1. input
        int t = Integer.parseInt(br.readLine()); // 테스트 케이스 t (횟수)


        for (int start = 0; start < t; start++) {
            result = 0;
            st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken()); // 배추밭의 가로 길이 m ( [][m] )
            n = Integer.parseInt(st.nextToken()); // 배추밭의 세로 길이 n ( [n][] )
            int k = Integer.parseInt(st.nextToken()); // 배추가 심어져있는 위치의 개수 k
            visited = new boolean[n][m];
            arr = new boolean[n][m];

            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken()); // 배추의 위치 m (가로)
                int b = Integer.parseInt(st.nextToken()); // 배추의 위치 n (세로)
                arr[b][a] = true;
            }


            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (!visited[i][j] && arr[i][j]) { // 방문을 하지 않았고 and 배추가 있는 곳을 방문한다.
                        result++; // (0, 0)에 접근을 하면 당연히 지렁이가 필요하니까 ++을 해준다.
                        dfs(i, j);
                    }
                }
            }

            System.out.println(result);

        }

    }

    public static void dfs(int y, int x) {
        visited[y][x] = true; // 방문처리
        /*
        내가 (0, 0)을 방문을 했다고 가정해보자.
        그럼 상, 하, 좌, 우 붙어있는 배추를 확인하고 배추가 존재하면 방문을 해서 지렁이 개수 (result++)을 막아야 한다.
        맨 처음 이 dfs 메서드를 실행하기 전에 방문이 안 되어있는 곳만 dfs를 실행 후, result++을 하기 때문이다.
         */

        for (int i = 0; i < 4; i++) {
            int newX = x + col[i]; // (0, 0)을 들어왔을 때, 0 + (0, 0, 1, -1)을 통해서 상 하 좌 우 다 움직이는 거임
            int newY = y + row[i]; // (0, 0)을 들어왔을 때, 0 + (1, -1, 0, 0)을 통해서 상 하 좌 우 다 움직이는 거임

            if (0 <= newX && newX < m && 0 <= newY && newY < n) {
                if (!visited[newY][newX] && arr[newY][newX]) { // 이 식도 위와 마찬가지로 조건이 필요함
                    dfs(newY, newX);
                }
            }
        }
    }
}
