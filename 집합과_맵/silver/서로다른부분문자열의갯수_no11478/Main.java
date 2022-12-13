package 집합과_맵.silver.서로다른부분문자열의갯수_no11478;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1. input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        // 2. subString 함수를 이용해서 쪼갠 후, Set(중복 제거)에 담기
        Set<String> set = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                set.add(word.substring(i, j));
            }
        }

        // 3. Set.size 출력
        System.out.println(set.size());
    }
}
