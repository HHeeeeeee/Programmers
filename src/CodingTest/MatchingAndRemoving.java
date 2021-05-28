package CodingTest;

import java.util.Stack;

/**
 * @author HHeeeeeee
 * 코딩테스트 연습 - 짝지어 제거하기
 * https://programmers.co.kr/learn/courses/30/lessons/12973
 */
public class MatchingAndRemoving {

	public static void main(String[] args) {
		String s = "abcccba";
		int result = solution(s);
		System.out.println(result);
	}
	
	private static int solution(String s) {
        int answer = 0;

        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
           if ((!stack.empty()) && (stack.peek().equals(s.charAt(i)))) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        
        if (stack.empty()) {
            answer = 1;
        }

        return answer;
    }

}
