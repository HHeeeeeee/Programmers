package MonthlyTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MonthlyTest4_2 {
	public static void main(String[] args) {
		int result = solution("(){}[]");
		System.out.println(result);
	}

	public static int solution(String s) {
        int answer = 0;
        
        Map<String, String> map = new HashMap<>();
        map.put("(", ")");
        map.put("{", "}");
        map.put("[", "]");

        String newS = s;
        for (int i = 0; i < s.length(); i++) {
            Stack<String> stack = new Stack<>();
            for (int j = 0; j < newS.length(); j++) {
                stack.push(String.valueOf(newS.charAt(j))); 
            }
            
            String tempStr = newS;
            String temp0idx = String.valueOf(newS.charAt(0));
            newS = "";
            
            for (int k = 0; k < tempStr.length(); k++) {
                try {
                    newS += String.valueOf(tempStr.charAt(k+1));
                } catch (IndexOutOfBoundsException e) {
                    newS += temp0idx;
                }
            }
            
            Stack<String> tempStack = new Stack<>();
            
            while (stack.size() > 0) {
                if (")".equals(stack.peek()) || "}".equals(stack.peek()) || "]".equals(stack.peek())) {
                    String stackTop = stack.peek();
                    stack.pop();
                	tempStack.push(stackTop);
                }
                if ("(".equals(stack.peek()) || "{".equals(stack.peek()) || "[".equals(stack.peek())) {
                    if (!tempStack.isEmpty()) {
                        if (tempStack.peek().equals(map.get(stack.peek()))) {
                            stack.pop();
                            tempStack.pop();
                        } else {
                        	break;
                        }
                    } else {
                    	break;
                    }
                }
                
                if (stack.size() == 0) {
                    answer++;
                }
            }
        }
        
        return answer;
	}
}
