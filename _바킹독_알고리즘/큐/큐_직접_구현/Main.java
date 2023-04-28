package _바킹독_알고리즘.큐.큐_직접_구현;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static int[] arr = new int[5];
    public static int head = 0;
    public static int tail = 0;
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    }

    public static void push(int x) {
        arr[tail++] = x;
    }

    public static void pop() {
        head++;
    }

    public static int front() {
        return arr[head];
    }

    public static int back() {
        return arr[tail - 1];
    }

}
