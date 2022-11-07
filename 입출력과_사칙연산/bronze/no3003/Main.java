package 입출력과_사칙연산.bronze.no3003;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        List<Integer> chess = List.of(1,1,2,2,2,8);
        List<Integer> answer = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputUserNumber = new ArrayList<>(chess.size());
        String piece = scanner.nextLine();
        for (int i = 0; i < piece.length(); i++) {
            inputUserNumber.add(piece.charAt(i) - '0');
        }
        for (int i = 0; i < chess.size(); i++) {
            System.out.print(chess.get(i) - inputUserNumber.get(i) + " ");
        }
    }
}
