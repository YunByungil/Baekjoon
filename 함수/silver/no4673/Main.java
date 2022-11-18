package 함수.silver.no4673;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Set<Integer> num = new LinkedHashSet<>();
        int test = 0;
        String check = "";
        for (int i = 1; i <= 10000; i++) {
            test = i;
            check = "" + i;
            for (int j = 0; j < check.length(); j++) {
                test += check.charAt(j) - '0';
            }
            numbers.add(test);
        }
        int checkPoint = 0;
        for (int i = 1; i <= 10000; i++) {
            for (int j = 0; j < numbers.size(); j++) {
                if (numbers.get(j) == i) {
                    checkPoint = 0;
                    break;
                } else if (numbers.get(j) != i) {
                    checkPoint++;
                }
            }
            if (checkPoint > 0) {
                num.add(i);
            }
            checkPoint = 0;
        }

        for (Integer integer : num) {
            System.out.println(integer);
        }

    }
}
