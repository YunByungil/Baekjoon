package 프로그래머스.Level0.다음에올숫자;

class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int check = 0;
        int d = 0;
        int r = 0;

        check = common[2] - common[1];

        if (common[2] == common[0] + (check * 2)) {
            d = check;
            answer = common[common.length - 1] + d;
        } else {
            r = common[1] / common[0];
            answer = common[common.length - 1] * r;
        }
        return answer;
    }
}
