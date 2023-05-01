package _바킹독_알고리즘.덱.덱_직접_구현;

public class Main {
    public static int MX = 1_000_005;
    public static int[] arr = new int[2 * MX + 1];
    public static int head = MX;
    public static int tail = MX;

    public static void main(String[] args) {
        test();
    }

    public static void push_front(int x) {
        arr[--head] = x;
    }
    public static void push_back(int x) {
        arr[tail++] = x;
    }


    public static void pop_front() {
        head++;
    }
    public static void pop_back() {
        tail--;
    }

    public static int front() {
        return arr[head];
    }
    public static int back() {
        return arr[tail - 1];
    }

    public static void test() {
        push_back(30);
        System.out.println(front()); // 30 출력
        System.out.println(back()); // 30 출력
        push_front(25); // 25 30
        push_back(12); // 25 30 12
        System.out.println(back()); // 12 출력
        push_back(62); // 25 30 12 62
        pop_front(); // 30 12 62
        System.out.println(front()); // 30 출력
        pop_front(); // 12 62
        System.out.println(back()); // 62 출력
    }
}
