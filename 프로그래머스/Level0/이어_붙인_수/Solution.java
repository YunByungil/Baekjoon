package 프로그래머스.Level0.이어_붙인_수;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String odd = "";
        String even = "";

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even += num_list[i];
            } else {
                odd += num_list[i];
            }
        }

        answer = Integer.parseInt(odd) + Integer.parseInt(even);
        return answer;
    }
}
