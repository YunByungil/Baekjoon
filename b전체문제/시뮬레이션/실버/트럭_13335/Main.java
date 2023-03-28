package b전체문제.시뮬레이션.실버.트럭_13335;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static int n, w, l;
    public static int count, check, sum;
    public static int[] arr2;
    public static Queue<Integer> q = new LinkedList<>();
    public static Queue<Integer> arr = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());

        arr2 = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
           arr.add(Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < w; i++) {
            q.add(0);
        }

        while (!q.isEmpty()) {
            count++;

            check -= q.poll();

            if (!arr.isEmpty()) {
                if (arr.peek() + check <= l) {
                    check += arr.peek();
                    q.offer(arr.poll());
                } else {
                    q.offer(0);
                }
            }
        }

        System.out.println("count = " + count);

    }
}
