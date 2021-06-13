package CodingTest;

/**
 * @author HHeeeeeee
 * 코딩테스트 연습 - Summer/Winter Coding(~2018) - 점프와 순간 이동
 * https://programmers.co.kr/learn/courses/30/lessons/12980
 */
public class JumpNMove {
	public static void main(String[] args) {
		int n = 5000;
		int result = solution(n);
		System.out.println(result);
	}

    public static int solution(int n) {
        int battery = 0;

        while (n > 0) {
            battery += (n % 2);
            n /= 2;
        }

        return battery;
    }
}
