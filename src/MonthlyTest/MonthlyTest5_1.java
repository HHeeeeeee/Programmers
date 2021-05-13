package MonthlyTest;

import java.util.HashMap;
import java.util.Map;

public class MonthlyTest5_1 {

	public static void main(String[] args) {
		int left = 13; 
		int right = 17;
		int result = solution(left, right);
		System.out.println(result);
	}

	private static int solution(int left, int right) {
        int answer = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        
        for (int i = left; i <= right; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count ++;
                }
            }
            countMap.put(i, count);
        }
        
        for (int key : countMap.keySet()) {
            if ((countMap.get(key) % 2) == 0) {
                answer = answer + key;
            } else {
                answer = answer - key;
            }
        }
        
        return answer;
    }
}
