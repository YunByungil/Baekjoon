package 큐_덱.실버.프린터큐_1966;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        LinkedList<Integer> queue = new LinkedList<>();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int num = 0;
        for (int i = 1; i <= a; i++) {
            queue.offer(i);
        }
        num = queue.get(b);

        st = new StringTokenizer(br.readLine());
        // 문제 이해 ok
        // 중요도 순서로 어떻게 처리해애 되는지 해결 x

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < a; i++) {
            int c = Integer.parseInt(st.nextToken());
            list.offer(c);
        }

        int count = 0;
        for (int j = 0; j < list.size(); j++) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(0) < list.get(i)) {
                    list.offer(list.pop());
                    queue.offer(queue.pop());
                }
            }
        }

        for (Integer integer : queue) {
            System.out.print("queue : " + integer + " ");
        }

        for (Integer integer : list) {
            System.out.println(integer);
        }

        System.out.println(sb);
    }
}
