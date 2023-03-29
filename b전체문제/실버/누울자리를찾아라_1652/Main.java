package b전체문제.실버.누울자리를찾아라_1652;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static int n, rowCount, colCount;
    public static char[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new char[n][n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j + 1 < n) {
                    if (arr[i][j] == '.' && arr[i][j + 1] == '.' && (j + 2 >= n || arr[i][j + 2] == 'X')) {
                        colCount++;
                    }
                }

                if (j + 1 < n) {
                    if (arr[j][i] == '.' && arr[j + 1][i] == '.' && (j + 2 >= n || arr[j + 2][i] == 'X')) {
                        rowCount++;
                    }
                }
            }
        }

        System.out.println(colCount + " " + rowCount);


    }
}
