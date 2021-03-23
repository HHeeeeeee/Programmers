package IntermediateLevelJava;

public class IntegerExam {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int answer = sol.solution(25413);
		System.out.println(answer);
	}
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        String strN = Integer.toString(n);
        
        for (int i = 0; i < strN.length(); i++) {
            char chN = strN.charAt(i);
            answer += Character.getNumericValue(chN);
        }

        return answer;
    }
}