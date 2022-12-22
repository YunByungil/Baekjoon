package 큐_덱.골드.AC_5430;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    static LinkedList<Integer> queue = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();

    static int rCount = 0;

    public static void main(String[] args) throws IOException {
        // 1. input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // R => 뒤집기, D => 첫 번째 수 버리기

        int n = Integer.parseInt(br.readLine()); // 테스트케이스 갯수

//        StringTokenizer st = new StringTokenizer(br.readLine(), ",");
//        String str = br.readLine();
//        System.out.println("str = " + str);
//
//        str = str.substring(1, str.length() - 1);
//        System.out.println("str = " + str);
//
//        String[] arr = str.split(",");
//
//        for (String s : arr) {
//            System.out.println("s = " + s);
//        }
//
//        LinkedList<Integer> list = new LinkedList<>();
//        for (String s : arr) {
//            list.offer(Integer.parseInt(s));
//        }
//        System.out.println("list = " + list);

        for (int i = 0; i < n; i++) {
            queue = new LinkedList<>();
            rCount = 0;
            String str = br.readLine(); // 수행할 함수
            int m = Integer.parseInt(br.readLine()); // 배열에 들어있는 수의 갯수
            String arr = br.readLine();
            arr = arr.substring(1, arr.length() - 1);
            String[] arr2 = arr.split(",");
            if (m != 0) {
                for (String s : arr2) {
                    queue.offer(Integer.parseInt(s));
                }
            }
            checkRAndD(str);
        }

        System.out.println(sb);
    }

    public static void checkRAndD(String str) {
        boolean result = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'R') {
                playR();
            } else if (str.charAt(i) == 'D') {
                result = playD();
                if (!result) {
                    break;
                }
            }
        }
        if (result) {
            if (queue.size() > 0) {
                int size = queue.size();
                sb.append("[");
                for (int i = 0; i < size - 1; i++) {
                    sb.append(queue.poll()).append(",");
                }
                sb.append(queue.poll());
                sb.append("]").append("\n");
            } else {
                sb.append("[]").append("\n");
            }
        } else {
            sb.append("error").append("\n");
        }
    }

    public static void playR() {
        int size = queue.size();
        LinkedList<Integer> temp = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            temp.offer(queue.pollLast());
        }
        queue = new LinkedList<>(temp);
    }

    public static boolean playD() {
        if (queue.isEmpty()) {
            return false;
        } else {
            queue.poll();
            return true;
        }
    }
}
