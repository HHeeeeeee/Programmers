import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author HHeeeeeee
 * 코딩테스트 연습 - 숫자의 표현
 * https://programmers.co.kr/learn/courses/30/lessons/12924
 */
public class ExpressionOfNumber {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int num = Integer.parseInt(br.readLine());
			bw.write(solution(num) + "\n");
			
			bw.flush();
			bw.close();
			br.close();
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}

	private static int solution(int n) {
		int answer = 0;

		for (int i = 1; i <= n; i++) {
			int sum = 0;
			for (int j = i; j <= n; j++) {
				sum += j;
				if (sum == n) {
					answer++;
				} else if (sum > n) {
					break;
				}
			}
		}

		return answer;
	}
}
