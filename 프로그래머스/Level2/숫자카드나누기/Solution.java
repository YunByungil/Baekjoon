package 프로그래머스.Level2.숫자카드나누기;

public class Solution {
    public static void main(String[] args) {
//        int[] arrayA = {10, 17};
//        int[] arrayB = {5, 20};

        int[] arrayA = {14, 35, 119};
        int[] arrayB = {18, 30, 102};

//
//        int[] arrayA = {14, 35, 119};
//        int[] arrayB = {18, 30, 102};

        // 1. 철수가 가진 숫자를 나눌 수 있는 가장 큰 양의 정수a,
        // 동시에 영희가 가진 숫자를 나눌 수 없어야 함.

        // 2. 영희가 가진 숫자를 나눌 수 있는 가장 큰 양의 정수a,
        // 동시에 철수가 가진 숫자 나누기 x

        // 3. 두 조건 중 더 큰 a를 구함.
        // 만족 x => return 0

        // 최대공약수로 접근하자.
        int a = arrayA[0];
        int b = arrayB[0];

        for (int i = 0; i < arrayA.length; i++) {
            a = gcd(a, arrayA[i]);
            b = gcd(b, arrayB[i]);
        }


        System.out.println("checkDiv : " + checkDiv(a, arrayB));
        System.out.println("checkDiv2 : " + checkDiv2(b, arrayA));
        int chulSu = checkDiv(a, arrayB);
        int yongHee = checkDiv2(b, arrayA);

        int answer = getMax(chulSu, yongHee);
        System.out.println(answer);

    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int checkDiv(int a, int[] arrB) { // 철수 a : 영희 B / 철수 최대 공약수로 영희 숫자 나눌 수 있나?
        int result = 0;
        for (int i = 0; i < arrB.length; i++) {
            result = arrB[i] % a;
            if (result == 0) {
                return 0;
            }
        }
        return a;
    }

    public static int checkDiv2(int b, int[] arrA) { // 영희 b : 철수 A / 영희 촤대 공약수로 영희 숫자 나눌 수 있?
        int result = 0;
        for (int i = 0; i < arrA.length; i++) {
            result = arrA[i] % b;
            if (result == 0) {
                return 0;
            }
        }
        return b;
    }

    public static int getMax(int a, int b) { // 철수 영희 최대 공약수 비교해서 더 큰 값 return if ( 1이면 return 0 )
        if (a == 0 || b == 0) {
            return 0;
        }
        int result = Math.max(a, b);
        if (result == 1) {
            return 0;
        } else {
            return result;
        }
    }
}
