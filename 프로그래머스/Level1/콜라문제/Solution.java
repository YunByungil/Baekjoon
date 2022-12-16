package 프로그래머스.Level1.콜라문제;

public class Solution {
    public static void main(String[] args) {
        int a = 2; // a병 부터 교환 가능 ( 2병부터 교환 가능)
        int b = 1; // 2병 들고가면 새거 1병 줌
        int n = 20; // 총 빈 병의 갯수

        int full = 0;
        int rest = 0;

        int count = 0;

        boolean bol = true;
        while (bol) {
            // n은 빈 병
            full = (n / a) * b; // 빈 병 20개에서 a병을 나누면 새로운 병을 이만큼 얻을 수 있음. ( 20 / 2 ) => 10병
            count += full; // 빈 병 n개로 얻은 새로운 병을 count 변수에 누적.
            rest = n % a; // 나머지 (빈 병 x)
            n = full + rest; // 나머지 병 + 새로운 병을 다시 n으로 저장

            if (n < a) { // 더이상 빈 병으로 full 병을 얻지 못할 때, 종료
                bol = false;
            }
        }

        System.out.println(count);
    }
}
