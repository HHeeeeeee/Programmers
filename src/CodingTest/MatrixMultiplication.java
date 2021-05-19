package CodingTest;

import java.util.Arrays;

/**
 * @author HHeeeeeee
 * 코딩 테스트 연습 - 행렬의 곱셈
 */
public class MatrixMultiplication {

	public static void main(String[] args) {
		int[][] arr1 = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
		int[][] arr2 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};
		
		int[][] result = solution(arr1, arr2);
		System.out.println(Arrays.deepToString(result));
	}
	
	public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                for (int k = 0; k < arr2[0].length; k++) {
                    answer[i][k] += arr1[i][j] * arr2[j][k];
                }
            }
        }
        
        return answer;
    }

}
