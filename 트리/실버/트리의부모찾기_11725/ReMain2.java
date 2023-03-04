package 트리.실버.트리의부모찾기_11725;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ReMain2 {
    public static int n;
    public static int[] arr;
    public static boolean[] visit;
    public static List<List<Integer>> list = new ArrayList<>();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());    
        n = Integer.parseInt(st.nextToken());
        arr = new int[n + 1];
        visit = new boolean[n + 1];
        
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        
        for (int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            list.get(a).add(b);
            list.get(b).add(a);
        }

        // preOrder를 이용해서 순회를 하면 부모를 구할 수 있다.
        preOrder(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(arr[i]);
        }
        
    }
    
    public static void preOrder(int start) {
        visit[start] = true;

        for (Integer integer : list.get(start)) {
            if (!visit[integer]) {
                arr[integer] = start;
                preOrder(integer);
            }
        }
    }
}
