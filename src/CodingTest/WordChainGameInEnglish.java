package CodingTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author HHeeeeeee
 * 코딩테스트 연습 - 영어 끝말잇기
 * https://programmers.co.kr/learn/courses/30/lessons/12981
 */
public class WordChainGameInEnglish {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		try {
			int n = Integer.parseInt(br.readLine());
			String[] words = br.readLine().split(", ");
			
			int[] result = solution(n, words);
			bw.write(Arrays.toString(result) + "\n");
			
			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        
        List<String> list = new ArrayList<>();
        int count = 1;
        int term = 0;
        int person = 0;
        String lastSpelling = words[0].substring(0, 1);
        
        for (String str : words) {
            if (str.substring(0, 1).equals(lastSpelling)) {
                if (!list.contains(str)) {
                    list.add(str);
                } else {
                    person = (count % n == 0) ? n : (count % n);
                    term = (count % n == 0) ? (count / n) : ((count / n) + 1);
                    break;
                }
            } else {
                person = (count % n == 0) ? n : (count % n);
                term = (count % n == 0) ? (count / n) : ((count / n) + 1);
                break;
            }
            lastSpelling = str.substring(str.length()-1, str.length());
            count++;
        }
        
        answer[0] = person;
        answer[1] = term;

        return answer;
    }
}
