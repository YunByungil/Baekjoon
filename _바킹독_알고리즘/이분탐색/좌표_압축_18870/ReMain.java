package _바킹독_알고리즘.이분탐색.좌표_압축_18870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ReMain {
    public static int n, count;
    public static StringBuilder sb = new StringBuilder();
    public static List<Integer> arr = new ArrayList<>();
    public static List<Integer> input = new ArrayList<>();
    public static List<Integer> unique = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        n = Integer.parseInt(br.readLine());
        arr = new ArrayList<>();
        unique = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }
        input = new ArrayList<>(arr);
        Collections.sort(arr);

        for (int i = 0; i < n; i++) {
            if (i == 0 || !arr.get(i - 1).equals(arr.get(i))) {
                unique.add(arr.get(i));
            }
        }

//        for (Integer i : unique) {
//            System.out.println("i = " + i);
//        }

//        for (Integer i : arr) {
//            if (!unique.contains(i)) {
//                unique.add(i);
//            }
//        }

        for (Integer i : input) {
            binarySearch(i);
        }

        System.out.println(sb);


    }

    public static void binarySearch(int num) {
        int start = 0;
        int end = unique.size();

        while (start < end) {
            int mid = (start + end) / 2;

            if (unique.get(mid) == num) {
                end = mid;
            } else if (unique.get(mid) > num) {
                end = mid;
            } else if (unique.get(mid) < num) {
                start = mid + 1;
            }
        }

        sb.append(start).append(" ");
    }
}
