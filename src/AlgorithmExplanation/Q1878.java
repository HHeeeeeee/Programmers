package AlgorithmExplanation;

import java.util.Arrays;

public class Q1878 {

	public static void main(String[] args) {
		int[][] points = {{1, 4}, {3, 4}, {3, 10}};
		int[] result = solution(points);
		System.out.println(Arrays.toString(result));
	}

    static int[] solution(int[][] v) {
        int[] answer = {0, 0};
        
        for (int i = 0; i < 3; i++) {
        	answer[0] ^= v[i][0];
        	answer[1] ^= v[i][1];
        }

        return answer;
    }
}
