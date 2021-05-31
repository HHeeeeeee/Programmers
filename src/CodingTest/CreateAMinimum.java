package CodingTest;

import java.util.Arrays;

/**
 * @author HHeeeeeee
 * 최솟값 만들기 
 * https://programmers.co.kr/learn/courses/30/lessons/12941
 */
public class CreateAMinimum {

	public static void main(String[] args) {
		int A[] = {1, 2};
		int B[] = {3, 4};
		int result = solution(A, B);
		System.out.println(result);
	}

	private static int solution(int[] A, int[] B) {
		int answer = 0;

		Arrays.sort(A);
		Arrays.sort(B);

		int idx = B.length - 1;
		for (int i = 0; i < A.length; i++) {
			answer += A[i] * B[idx];
			idx--;
		}

		return answer;
	}
}
