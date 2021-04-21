package CodingTest;

import java.util.*;

public class phoneNumberBook {

	public static void main(String[] args) {
		String skill = "CBD";
		String skill_trees[] = {"BACDE", "CBADF", "AECB", "BDA", "RIW"};
		System.out.println(solution(skill, skill_trees));
	}

	private static int solution(String skill, String[] skill_trees) {
        boolean answer = false;
        
        Arrays.sort(phone_book);
        
        for (int i = 1; i < phone_book.length; i++) {
            if (!phone_book[i].startsWith(phone_book[i-1])) {
                answer = true;
            } else {
                answer = false;
                break;
            }
        }
        
        return answer;
    }
}