package CodingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author HHeeeeeee
 * 코딩테스트 연습 - N개의 최소공배수
 */
public class LeastCommonMultiple {

	public static void main(String[] args) {
		int[] arr = {2,6,8,14};
		int result = solution(arr);
		System.out.println(result);
	}
	
	public static int solution(int[] arr) {
        int answer = 1;
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        
        for (int j = 2; j <= arr[0]; j++) {
            int min = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % j == 0) {
                    min = j;
                } else {
                    break;
                }
            }
            
            if (min > 0) {
                for (int k = 0; k < arr.length; k++) {
                    arr[k] /= min;
                }
                list.add(min);
            }
        }
        
        for (int n1 : arr) {
            answer *= n1;
        }
        
        for (int n2 : list) {
            answer *= n2;
        }
        
        return answer;
    }
}
