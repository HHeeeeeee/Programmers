package CodingTset;

import java.util.Arrays;

public class HIndex {

	public static void main(String[] args) {
		int[] citations = {3, 0, 6, 1, 5};
		int result = solution(citations);
		System.out.println(result);
	}

	public static int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        int maxNum = citations[citations.length - 1];

        for (int i = maxNum; i >= 0; i--) {
            int count = 0;
            for (int j = 0 ; j < citations.length; j++) {
                if (citations[j] >= i) {
                    count ++;
                }
            }

            if (count >= i) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}
