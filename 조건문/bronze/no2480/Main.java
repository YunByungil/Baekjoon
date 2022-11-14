package 조건문.bronze.no2480;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dice1 = scanner.nextInt();
        int dice2 = scanner.nextInt();
        int dice3 = scanner.nextInt();

        List<Integer> dice = new ArrayList<>();
        dice.add(dice1);
        dice.add(dice2);
        dice.add(dice3);
        Collections.sort(dice);

        int sameCount = 0;
        int sameNumber = 0;

        int maxNumber = dice.get(2);

        for (int i = 0; i < dice.size() - 1; i++) {
            for (int j = i+1; j < dice.size(); j++) {
                if (dice.get(i) == dice.get(j)) {
                    sameCount++;
                    sameNumber = dice.get(i);
                }
            }
        }

        if (sameCount == 3) {
            System.out.println(10_000 + dice.get(0) * 1_000);
        } else if (sameCount == 1) {
            System.out.println(1_000 + sameNumber * 100);
        } else if (sameCount == 0) {
            System.out.println(maxNumber * 100);
        }
    }
}
