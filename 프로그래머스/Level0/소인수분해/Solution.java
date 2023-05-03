package 프로그래머스.Level0.소인수분해;

import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        Set<Integer> set = new TreeSet<>();

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                set.add(i);
                n /= i;
                i--;
            }

        }
        answer = new int[set.size()];
        int count = 0;
        for (Integer s : set) {
            answer[count++] = s;
        }
        return answer;
    }
}
