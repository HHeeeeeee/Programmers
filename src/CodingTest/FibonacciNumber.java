package CodingTest;

/**
 * @author HHeeeeeee
 * 코딩테스트 연습 - 피보나치 수
 * https://programmers.co.kr/learn/courses/30/lessons/12945
 */
public class FibonacciNumber {
	public static void main(String[] args) {
		int n = 5;
		int result = solution(n);
		System.out.println(result);
	}
	
	private static int solution(int n) {
        int[] d = new int[n + 1];
        d[0] = 0;
        d[1] = 1;
        d[2] = 1;
        for (int i = 3; i <= n; i++) {
            d[i] = (d[i - 1] % 1234567 + d[i - 2]) % 1234567;
        }
        return d[n] % 1234567;
    }
}
