package 그래프와순회.골드.이분그래프_1707;

import javax.swing.plaf.PanelUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int k, v, e;

    public static boolean[] visit;
    public static List<List<Integer>> list = new ArrayList<>();


    public static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        /*
        이분 그래프 특징:
        인접한 정점끼리 서로 다른 색으로 칠해서 모든 젖엄을 두 가지 색으로만 칠할 수 있는 그래프
         */

        v = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());


    }


}
