package _바킹독_알고리즘.재귀.재귀_직접_구현;

public class Main {
    public static void main(String[] args) {
        System.out.println(func1(10));
    }

    public static int func1(int n) {
        if (n == 0) {
            return n;
        }

        return n + func1(n - 1);
    }
}
