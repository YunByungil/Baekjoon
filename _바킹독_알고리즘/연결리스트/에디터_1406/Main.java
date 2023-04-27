package _바킹독_알고리즘.연결리스트.에디터_1406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static String str; // 주어진 문자열
    public static int M; // 명령어의 개수

    public static int location; // 현재 커서 위치
    public static List<Character> list = new LinkedList<>();
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        str = br.readLine();
        M = Integer.parseInt(br.readLine());
        location = str.length();

        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            if (input.equals("L")) {
                moveLeft();
            } else if (input.equals("D")) {
                moveRight();
            } else if (input.equals("B")) {
                delete();
            } else if (input.length() == 3) {
                insert(input.charAt(2));
            }
        }

        for (Character c : list) {
            sb.append(c);
        }
        System.out.println(sb);

    }


    // L -> 왼쪽으로 한 칸
    public static void moveLeft() {
        if (location == 0) {
            return;
        }
        location--;
    }

    // D -> 오른쪽으로 한 칸
    public static void moveRight() {
        if (location == list.size()) {
            return;
        }
        location++;
    }

    // B -> 왼쪽에 있는 문자를 삭제
    public static void delete() {
        if (location == 0) {
            return;
        }
        list.remove(location - 1);
        location--;
    }

    // P $ -> $라는 문자를 왼쪽에 추가함
    public static void insert(char word) {
        list.add(location, word);
        location++;
    }


}
