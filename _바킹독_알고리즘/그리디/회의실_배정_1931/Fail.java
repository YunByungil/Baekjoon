package _바킹독_알고리즘.그리디.회의실_배정_1931;

import java.util.*;
import java.io.*;

public class Fail {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                int time = Integer.parseInt(st.nextToken());

                arr[i][j] = time;
            }
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }

        });

        int answer = 1;
        int start = arr[0][1];

        for (int i = 1; i < n; i++) {
            if (arr[i][0] >= start) {
                answer++;
                start = arr[i][1];
            }
        }

        System.out.println(answer);


    }
}


