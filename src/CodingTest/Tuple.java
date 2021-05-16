package CodingTest;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author HHeeeeeee
 * https://programmers.co.kr/learn/courses/30/lessons/64065
 *
 */
public class Tuple {
	public static void main(String[] args) {
		String s = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
		int[] result = solution(s);
		System.out.println(Arrays.toString(result));
	}

	private static int[] solution(String s) {
        int[] answer = {};
        String [] strs = s.replaceAll("[{}]", " ").trim().split(" ,");
        answer = new int[strs.length];
        HashSet<Integer> hs = new HashSet<Integer>();
        Arrays.sort(strs, (a,b)->(a.length()-b.length()));
        int i = 0;
        for (String str : strs) {
            for (String st : str.split(",")) {
                int a  = Integer.parseInt(st.trim());
                if(hs.contains(a))continue;
                hs.add(a);
                answer[i++] = a;
            }
        }
        return answer;
    }
}
