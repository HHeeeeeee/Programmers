package CodingTest;
import java.util.*;

/**
 * @author HHeeeeeee
 * https://programmers.co.kr/learn/courses/30/lessons/42885
 * 코딩테스트 연습 - 탐욕법(Greedy) - 구명보트
 */
public class Lifeboat {

	public static void main(String[] args) {
		int[] people = {70, 50, 80, 50};
		int limit = 100;
		int result = solution(people, limit);
		System.out.println(result);
	}
	
    public static int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        int idxF = 0;
        for (int idxL = people.length - 1; idxF <= idxL; idxL--) {
            answer ++;
            int sum = people[idxF] + people[idxL];
            if (sum <= limit) {
                idxF ++;
            }
        }
        
        return answer;
    }
}
