package CodingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author HHeeeeeee
 * https://programmers.co.kr/learn/courses/30/lessons/42586
 * 프로그래머스 - 코딩테스트 연습 - 스택/큐 - 기능개발
 */
public class FunctionDevelopment {

	public static void main(String[] args) {
		int[] progresses = {40, 93, 30, 55, 60, 65};
		int[] speeds = {60, 1, 30, 5 , 10, 7};
		int[] result = solution(progresses, speeds);
		System.out.println(Arrays.toString(result));
	}
	
	private static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int job = (int)Math.ceil((double)(100 - progresses[i]) / (double)speeds[i]);
            queue.offer(job);
        }
        
        int prev = queue.peek();
        int now = queue.poll();
        int sum = 0;
        int temp = now;
        list.add(1);
        
        while (!queue.isEmpty()) {
            now = queue.peek();
            
            if (temp >= now) {
                int idx = list.size() - 1;
                list.set(idx, list.get(idx) + 1);
                sum += now;
            } else {
                list.add(1);
                sum = 0;
                temp = now;
            }
            
            prev = queue.poll();
        }
        
        int[] answer = Arrays.stream(list.toArray(new Integer[list.size()])).mapToInt(Integer::intValue).toArray();
        
        return answer;
    }

}
