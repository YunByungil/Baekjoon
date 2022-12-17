package 큐_덱.실버.요세푸스문제0_11866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1. input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken()); // 1 ~ n까지 사람
//        int k = Integer.parseInt(st.nextToken()) - 1; // 순서대로 K번째 사람을 제거한다.
        int n = 7;
        int k = 3;
        sb.append("<");

        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while (queue.size() > 1) {
            System.out.println(queue.size());
            for (int i = 0; i < k - 1; i++) {
                int num = queue.poll();
                queue.offer(num);
            }

            sb.append(queue.poll()).append(", ");
        }

        sb.append(queue.pop()).append(">");
        System.out.println(sb);


    }
}
