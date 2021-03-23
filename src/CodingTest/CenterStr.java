package CodingTest;

public class CenterStr {

	public static void main(String[] args) {
		String result = solution("abcde");
		System.out.println(result);
	}
	
	static String solution(String s) {
		String answer = "";
		
		if (s.length() % 2 == 1) {
			answer = String.valueOf(s.charAt(s.length() / 2));
		} else {
			answer = s.substring(((s.length() / 2) - 1), ((s.length() / 2) + 1));
		}
		
		return answer;
	}

}
