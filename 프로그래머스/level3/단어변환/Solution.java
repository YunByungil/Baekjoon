package 프로그래머스.level3.단어변환;

import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        // words 내에 target이 존재하지 않으면 바로 반환
        if (!Arrays.asList(words).contains(target)) {
            return answer;
        }

        // 최단거리를 구할거기 때문에, 문제 조건에는 다시 활용하면 안 된다는 조건이 없지만
        // 원래 사용했던 단어를 다시 사용할 경우 최단거리에서 최소 +2만큼 벌어지게 된다.
        boolean[] visited = new boolean[words.length];

        // 거리를 저장하기 위한 distance 배열
        // begin에서 words[i]까지 도달하는데 걸린 최소 횟수
        // 원래는 Queue<int[]> 형식으로 주던 것을 Queue<Integer>로, 두 번째 값은 외부 배열로
        int[] distance = new int[words.length];

        // begin에서 일단 도달할 수 있는 words내의 단어를 Queue에 enqueue
        Queue<Integer> toVisit = new LinkedList<>();
        for (int i = 0; i < words.length; i++) {
            // 시작 단어와 유사한 단어일 경우
            if (similar(begin, words[i])) {
                // Queue에 enqueue
                toVisit.offer(i);
                visited[i] = true;
                distance[i] = 1;
            }
        }
        // BFS 진행
        while (!toVisit.isEmpty()) {
            int nextIdx = toVisit.poll();
            String nextWord = words[nextIdx];

            if (nextWord.equals(target)) {
                answer = distance[nextIdx];
                break;
            }

            for (int i = 0; i < words.length; i++) {

                if (similar(nextWord, words[i]) && !visited[i]) {
                    // Queue에 enqueue
                    toVisit.offer(i);
                    visited[i] = true;
                    distance[i] = distance[nextIdx] + 1;
                }
            }
        }

        return answer;
    }

    // 인접 판단 메소드: 두 단어가 한 글자 제외 동일한지?
    private boolean similar(String word, String target) {
        // String.charAt(i)
        int k = 0; // 몇 글자 일치하는지 저장

        for (int i = 0; i < word.length(); i++)  {
            if (word.charAt(i) == target.charAt(i)) {
                k++;
            }
        }

        return k == word.length() - 1;

    }
}
