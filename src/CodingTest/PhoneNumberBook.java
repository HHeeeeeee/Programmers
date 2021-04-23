package CodingTest;

import java.util.*;

public class PhoneNumberBook {

	public static void main(String[] args) {
		String phone_book[] = {"119", "97674223", "1195524421"};
		System.out.println(solution(phone_book));
	}

	private static boolean solution(String[] phone_book) {
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