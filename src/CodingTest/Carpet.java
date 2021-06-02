package CodingTest;
import java.util.*;

/**
 * @author HHeeeeeee
 * 코딩테스트 연습 - 카펫
 * https://programmers.co.kr/learn/courses/30/lessons/42842
 */
public class Carpet {
    public static void main(String[] args) {
        int brown = 24;
        int yellow = 24;
        int[] result = solution(brown, yellow);
        System.out.println(Arrays.toString(result));
    }    
    
    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 2; i < total; i++) {   // 약수 구하기 - 1-num은 해당안됨.
            int value = total / i; 
            int b = (i * 2) + (value * 2) - 4;
            int y = (i * value) - b;
            if ((2005000 >= b + y) && (brown == b) && (yellow == y)) {
                answer[0] = i;
                answer[1] = value;
            }
        }
        
        return answer;
    }
}
