import java.util.*;

public class FindPrimeNum {

	public static void main(String[] args) {
		System.out.println(solution(10));
	}

	private static int solution(int n) {
		int answer = 0;

		Integer primeArr[] = new Integer[n+1];    // 0 ~ n
		primeArr[0] = 0;    // 0
		primeArr[1] = 0;    // 1
		
		for (int i = 2; i <= n; i++) {
			primeArr[i] = 1;
		}
		
		for (int j = 2; j <= (int)Math.sqrt(n); j++) {
			if (primeArr[j] == 1) {
				for (int k = j+j; k <= n; k += j) {
					primeArr[k] = 0;
				} 
			}
		}
		
		for (int isPrime : primeArr) {
			if (isPrime == 1) {
				answer++;
			}
		}
		
		return answer;
    }
}