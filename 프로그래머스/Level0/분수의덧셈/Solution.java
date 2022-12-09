package 프로그래머스.Level0.분수의덧셈;

class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int count = 0;

        int boonja = (denum1 * num2) + (denum2 * num1);
        int boonmo = num1 * num2;
        int d = gcd(boonja, boonmo);

        int[] answer = {boonja / d, boonmo / d};


        return answer;
    }

    public static int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }

        return gcd(num2, num1 % num2);
    }
}
