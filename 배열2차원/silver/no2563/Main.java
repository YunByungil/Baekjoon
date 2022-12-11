package 배열2차원.silver.no2563;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static int[][] xLine;
    static int xCheck;

    public static void main(String[] args) throws IOException {
        // 0. input 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int ea = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();


        int[][] paper = new int[ea][2];
        for (int i = 0; i < ea; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // 겹치는 색종이가 있으면 제외하는 과정
        for (int i = 0; i < paper.length; i++) {
            set.add("" + paper[i][0] + paper[i][1]);
        }
        // 만약 색종이가 3개 겹치면 결국 최종 넓이는 100이라고 생각했다.
        int wide = 100 * set.size();
        xLine = new int[10000][2];


        // 1. 겹친 색종이 구하기 ( 가로 먼저 구하기 )

        for (int i = 0; i < ea - 1; i++) {
            for (int j = i + 1; j < ea; j++) {
                if (paper[i][0] == paper[j][0] && paper[i][1] == paper[j][1]) {

                } else {
                    getCheck(paper, paper[i][0], paper[j][0], i, j);
                }
            }
        }

        int result = 0;
        for (int i = 0; i < xLine.length; i++) {
            if (xLine[i][0] > 0 && xLine[i][1] > 0) {
                result += (xLine[i][0] - 1) * (xLine[i][1] - 1);
            }
        }

        System.out.println(wide - result);
        System.out.println(xCheck);
    }

    // x축이 겹친느 것을 먼저 찾고.

    public static void getCheck(int[][] paper, int x1, int x2, int row, int row2) {
        int count = 0;
        for (int i = x2; i <= x2 + 10; i++) {
            if (x1 <= i && i <= x1 + 10) {
                count++;
            }
        }
        if (count > 1) {
            xLine[xCheck][0] = count;
            getCheck2(paper, row, row2);
        }
        xCheck++;
    }

    // x축이 겹쳤으면 y축을 찾는다.
    public static void getCheck2(int[][] paper, int row, int row2) {
        int count = 0;
        int start = paper[row][1];
        int start2 = paper[row2][1];
        for (int i = start2; i <= start2 + 10; i++) {
            if (start <= i && i <= start + 10) {
                count++;
            }
        }
        xLine[xCheck][1] = count;
    }
}
