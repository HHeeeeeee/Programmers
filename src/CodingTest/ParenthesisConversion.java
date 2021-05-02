package codingTset;

/**
 * @author hee
 * https://programmers.co.kr/learn/courses/30/lessons/60058
 * 코딩테스트 연습 - 2020 KAKAO BLIND RECRUITMENT - 괄호 변환
*/
public class ParenthesisConversion {

	public static void main(String[] args) {
		String parenthesis = "()))((()";
		String result = solution(parenthesis);
		System.out.println(result);
	}

	public static String solution(String w) {
		if ("".equals(w)) {
            return "";
        }
        
        int left = 0;
        int right = 0;
        int i;
        for (i = 0; i < w.length(); i++) {
            char s = w.charAt(i);
            if (s == '(') {
                left++;
            } else {
                right++;
            }
            
            if (left == right) {
                break;
            } 
        }
        
        String u = w.substring(0, i+1);
        String v = w.substring(i+1);  
        
        if (isRight(u)) {
            u += solution(v);
        } else {
            String emp = "(" + solution(v) + ")";
            u = u.substring(1, u.length()-1);
            u = u.replaceAll("\\(", "\\/").replaceAll("\\)", "\\(").replaceAll("\\/","\\)");
            emp += u;
            return emp;
        }
        return u;
    }
    
	public static boolean isRight(String u) {
        while (!"".equals(u)) {
            if (u.charAt(0) == ')') {
                return false;
            }
            u = u.replaceAll("\\(\\)", "");
        }
        
        return true;
    }
}