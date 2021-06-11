package CodingTest;

import java.util.Arrays;

/**
 * @author HHeeeeeee
 * 코딩테스트 연습 - 이진 변환 반복하기 
 * https://programmers.co.kr/learn/courses/30/lessons/70129#
 */
public class ConvertToBinaryNumber {

	public static void main(String[] args) {
		String s = "110010101001";
		int[] result = solution(s);
		System.out.println(Arrays.toString(result));
	}

	private static int[] solution(String s) {
        int repeatCount = 0;
        int zeroCount = 0;
        
        while (!"1".equals(s)) {
            repeatCount++;
            String str = s.replaceAll("0", "");
            zeroCount += (s.length() - str.length());
            s = Integer.toBinaryString(str.length());
        }
        
        int[] answer = new int[2];
        answer[0] = repeatCount;
        answer[1] = zeroCount;
        
        return answer;
    }
}
