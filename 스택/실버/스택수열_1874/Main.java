package 스택.실버.스택수열_1874;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static Stack<Integer> stack = new Stack<>();
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. input
        int n = Integer.parseInt(br.readLine());
        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            checkEmpty(num, max);
            max = Math.max(max, num);
        }

        int size = stack.size();
        if (size == 0) {
            System.out.println(sb);
        } else {
            System.out.println("NO");
        }
    }

    public static void checkEmpty(int num, int max) {
        if (!stack.empty()) {
            // 스택이 비어있지 않을 때,
            // 1. peek 값이랑 num 값을 비교하고 같으면 pop
            if (stack.peek() == num) {
                deleteNumber();
            } else {
                // 2. max 보다 큰 num 만 저장한다.
                checkMaxNumberAndAddNumber(num, max);
            }

        } else {
            // 스택이 비어있을 때, 그냥 push
            addNumber(num, max);
        }
    }

    public static void addNumber(int num, int max) {
        for (int i = max + 1; i <= num; i++) {
            stack.push(i);
            sb.append("+").append("\n");
        }
        stack.pop();
        sb.append("-").append("\n");
    }

    public static void checkMaxNumberAndAddNumber(int num, int max) {
        if (num > max) {
            for (int i = max + 1; i <= num; i++) {
                stack.push(i);
                sb.append("+").append("\n");
            }
            stack.pop();
            sb.append("-").append("\n");
        }
    }

    public static void deleteNumber() {
        stack.pop();
        sb.append("-").append("\n");
    }
}
