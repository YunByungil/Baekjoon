package 브루트포스.silver.no1018;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // 0. input 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        String[] board = new String[row];
        for (int i = 0; i < row; i++) {
            st = new StringTokenizer(br.readLine());
            board[i] = st.nextToken();
        }

        // 1. 체스판 자르기
        int solution = Integer.MAX_VALUE;
        for (int i = 0; i <= row - 8; i++) {
            for (int j = 0; j <= col - 8; j++) {
                // 2. 현 체스판의 최소 비용 구하기
                int currentSolution = getSolution(i, j, board);
                // 3. 전체 최적의 값과 비교하여 갱신하기
                if (solution > currentSolution) {
                    solution = currentSolution;
                }
            }
        }
        System.out.println(solution);
    }

    public static int getSolution(int startRow, int startCol, String[] board) {
        String[] originalBoard = {"WBWBWBWB", "BWBWBWBW"};
        int whiteSolution = 0;

        for (int i = 0; i < 8; i++) {
            int row = startRow + i;
            for (int j = 0; j < 8; j++) {
                int col = startCol + j;
                System.out.println("row % 2 : " + row % 2);
                if (board[row].charAt(col) != originalBoard[row % 2].charAt(j)) {
                    whiteSolution++;
                }
            }
        }

        return Math.min(whiteSolution, 64 - whiteSolution);
    }
}
