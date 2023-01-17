package 이분탐색.골드.가장긴증가하는부분수열2_12015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static int n;
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        int num = 0;
        int result = 0;
        Set<Integer> set = new LinkedHashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(st.nextToken()));
//            arr[i] = Integer.parseInt(st.nextToken());
        }
        arr = new int[set.size()];
//        for (int i = 0; i < set.size(); i++) {
//            arr[i] = set.stream().iterator().next();
//        }
        int count = 0;
        for (Integer integer : set) {
            arr[count++] = integer;
        }

        int size = arr.length;
        int answer = Math.max(left(size), right(size));
        System.out.println(answer);

    }

    public static int left(int size) {
        int start = 0;
        int end = size;
        int num = 0;
        int result = 0;
        int max = 0;
        int lastLocation = 0;

        while (start < end) {
            result = 0;
            int mid = (start + end) / 2;
            num = arr[mid];
//            System.out.println("num = " + num);
            for (int i = 0; i < mid; i++) {
                if (arr[i] < num) {
                    result++;
                }
            }

            max = (Math.max(max, result));

            start = mid + 1;
            lastLocation += result;

        }

        return max + 1;
    }

    public static int right(int size) {
        int start = 0;
        int end = size;
        int num = 0;
        int result = 0;
        int max = 0;
        int lastLocation = 0;

        while (start < end) {
            result = 0;
            int mid = (start + end) / 2;
            num = arr[mid];
//            System.out.println("num = " + num);
            for (int i = 0; i < mid; i++) {
                if (arr[i] < num) {
                    result++;
                }
            }

            max = (Math.max(max, result));

            start = end;
            lastLocation += result;

        }

        return max + 1;
    }
}
