package 프로그래머스.level3.네트워크;

import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        // 방문했는지를 파악해야 한다.
        boolean[] visited = new boolean[n];

        // 모든 컴퓨터(정점)를 순회합니다.
        for (int i = 0; i < n; i++) {
            // 이 컴퓨터가 속한 네트워크를 확인한 적 없다면
            // 이 컴퓨터를 방문한 적 없다고 나올 것이다.
            if (!visited[i]) {
                network(i, n, computers, visited);
                answer++;
            }


        }
        return answer;
    }

    public void network(int computer, int n, int[][] computers, boolean[] visited) {
        // computer: 몇 번 컴퓨터부터 확인 예정인지
        // n: 컴퓨터의 개수
        // computers: 컴퓨터 연결 정보
        // visited: 컴퓨터 방문 정보

        Queue<Integer> toVisit = new LinkedList<>();
        toVisit.offer(computer);
        visited[computer] = true;

        while (!toVisit.isEmpty()) {
            int next = toVisit.poll();

            for (int i = 0; i < n; i++) {
                // computes[next][i] == 1: 연결되어있음
                // !visited[i]: 방문한 적 없음
                if (computers[next][i] == 1 && !visited[i]) {
                    System.out.println(next + " " + i);
                    toVisit.offer(i);
                    visited[i] = true;
                }
            }
        }
    }

}