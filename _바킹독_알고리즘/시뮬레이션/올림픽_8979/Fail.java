package _바킹독_알고리즘.시뮬레이션.올림픽_8979;

import java.util.*;
import java.io.*;

public class Fail {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        // 각 국가는 1부터 N 사이의 정수
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 국가의 수
        int k = Integer.parseInt(st.nextToken()); // 등수를 알고 싶은 국가 K

        int[][] arr = new int[n][5];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int line = Integer.parseInt(st.nextToken());
            arr[i][0] = line;
            for (int j = 1; j < 4; j++) {
                int medal = Integer.parseInt(st.nextToken());
                arr[i][j] = medal;
            }
        }


        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(final int[] o1, final int[] o2) {
                if (o1[1] < o2[1]) {
                    return o2[1] - o1[1];
                }
                if (o1[1] == o2[1]) {
                    if (o1[2] < o2[2]) {
                        return o2[2] - o1[2];
                    } else if (o1[2] == o2[2]) {
                        if (o1[3] < o2[3]) {
                            return o2[3] - o1[3];
                        } else if (o1[3] == o2[3]) {
                            if (o1[0] > o2[1]) {
                                return o1[0] - o2[0];
                            }
                        }
                    }
                }
                return o1[1] - o2[1];
            }
        });

        arr[0][4] = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i][1] == arr[i - 1][1]
                    && arr[i][2] == arr[i - 1][2]
                    && arr[i][3] == arr[i - 1][3]) {
                arr[i][4] = arr[i - 1][4];
            } else {
                arr[i][4] = i + 1;
            }
        }

//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < n; i++) {
            if (arr[i][0] == k) {
                System.out.println(arr[i][4]);
                return;
            }
        }
    }
}

