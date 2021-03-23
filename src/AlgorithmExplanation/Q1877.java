package AlgorithmExplanation;
import java.util.Arrays;

public class Q1877 {
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		int[] arr = {1,8,2,3,6,5,7};
		boolean result = sol.solution(arr);
		System.out.println(result);
	}
}
class Solution2 {
    public boolean solution(int[] arr) {
        boolean answer = true;
        
        Arrays.sort(arr);
        for (int i = 1; i <= arr.length; i++) {
            if (arr[i-1] != i) {
                answer = false;
                break;
            }
        }

        return answer;
    }
}