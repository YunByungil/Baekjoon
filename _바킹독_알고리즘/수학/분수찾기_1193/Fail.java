package _바킹독_알고리즘.수학.분수찾기_1193;

import java.io.*;
import java.util.*;

public class Fail {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int x = Integer.parseInt(br.readLine());
        int i = 1;

        while (x > i) {
            x -= i;
            i++;
        }
        int nume = x;
        int deno = i + 1 - x;
        if (i % 2 == 1) {
            int temp = nume;
            nume = deno;
            deno = temp;
        }
        System.out.println(nume + "/" + deno);
    }
}
