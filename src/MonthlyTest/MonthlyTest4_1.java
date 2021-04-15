package MonthlyTest;

public class MonthlyTest4_1 {
	public static void main(String[] args) {
		int[] absolutes = {5, 8, 4, 2, 1};
		boolean[] signs = {true, false, true, true, true};
		int result = solution(absolutes, signs);
		System.out.println(result);
	}

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == true) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        
        return answer;
    }
}
