package CodingTest;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author HHeeeeeee
 * https://programmers.co.kr/learn/courses/30/lessons/42626
 * 코딩테스트 연습 - 힙(Heap) - 더 맵게
 */
public class MoreSpicy {
	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		int result = solution(scoville, K);
		System.out.println(result);
	}

    public static int solution(int[] scoville, int K) {
        int answer = 0;
        
        Arrays.sort(scoville);
        
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
        for (int n : scoville) {
            q.add(n);
        }
        
        while (q.size() > 1 && q.peek() < K) {
            int idx1 = q.poll();
            int idx2 = q.poll();

            int mixHot = idx1 + (idx2 * 2);
            q.add(mixHot);
            answer++;
        }
        
        if (q.size() <= 1 && q.peek() < K) {
            answer = -1;
        }
        
        return answer;
    }
}
