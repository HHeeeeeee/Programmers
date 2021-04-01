package CodingTest;

import java.util.Stack;

public class Q49993 {

	public static void main(String[] args) {
		String skill = "CBD";
		String skill_trees[] = {"BACDE", "CBADF", "AECB", "BDA", "RIW"};
		System.out.println(solution(skill, skill_trees));
	}

	private static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        Stack<String> stack = new Stack<String>();
        
        for (String s : skill_trees) {
            boolean result = false;
            stack.clear();
            for (int i = skill.length()-1; i >= 0; i--) {
                stack.push(String.valueOf(skill.charAt(i)));
            }
            
            for (int i = 0; i < s.length(); i++) {
                String str = String.valueOf(s.charAt(i));
                if (stack.contains(str) && str.equals(stack.peek())) {
                    stack.pop();
                    result = true;
                } else if (stack.contains(str) && !str.equals(stack.peek())) {
                    result = false;
                    break;
                } else if (!stack.contains(str)) {
                	result = true;
                }
            }    
            
            if (result) {
                ++answer;
            }
        }
        
        return answer;
    }
}
