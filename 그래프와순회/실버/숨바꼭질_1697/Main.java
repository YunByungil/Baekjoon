package 그래프와순회.실버.숨바꼭질_1697;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static int count = 1;
    public static int n; // 수빈이의 현재 위치
    public static int k; // 동생의 현재 위치
    public static int arr[] = new int[100001];

    public static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        bfs(n);
    }

    public static void bfs(int num) {
        q.offer(num);
        arr[num] = 1;

        while (!q.isEmpty()) {
            int nowLocation = q.poll();
            System.out.println("nowLocation = " + nowLocation);
            for (int i = 0; i < 3; i++) {
                int nextLocation = 0;

                if (i == 0) {
                    nextLocation = nowLocation - 1;
                } else if (i == 1) {
                    nextLocation = nowLocation + 1;
                } else if (i == 2) {
                    nextLocation = nowLocation * 2;
                }

                if (nextLocation == k) {
                    System.out.println("arr[nowLocation] = " + arr[nowLocation]);
                    return;
                }

                if (nextLocation >= 0 && nextLocation < arr.length && arr[nextLocation] == 0) {
                    q.add(nextLocation);
                    arr[nextLocation] = arr[nowLocation] + 1;
                }
            }
        }

    }

}
