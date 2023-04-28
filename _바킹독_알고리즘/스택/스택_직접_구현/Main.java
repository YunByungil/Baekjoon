package _바킹독_알고리즘.스택.스택_직접_구현;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static int[] arr = new int[5];
    public static int index = 0;
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        push(5);
        push(4);
        push(3);
        pop();
        System.out.println(top());
        for (int i : arr) {
            System.out.println("i = " + i);
        }
    }

    public static void push(int x) {
        arr[index] = x;
        index++;
    }

    public static void pop() {
        arr[index - 1] = 0;
        index--;
    }

    public static int top() {
        return arr[index - 1];
    }
}
