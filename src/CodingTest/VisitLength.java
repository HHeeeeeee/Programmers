package com.kt.smcp.relay.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author HHeeeeeee
 * 방문 길이
 * https://programmers.co.kr/learn/courses/30/lessons/49994
 */
public class VisitLength {
	
	static List<String> list = new ArrayList<>();
	static int[] dir = new int[2];
	static int answer = 0;
    
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String dirs = br.readLine();
			int result = solution(dirs);
			bw.write(result + "\n");
			
			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			// TEST Auto-generated catch block
			e.printStackTrace();
		};
	}
		    
    private static int solution(String dirs) {
    	for (int i = 0; i < dirs.length(); i++) {
            int x = 0;
            int y = 0;
            String s = String.valueOf(dirs.charAt(i));
            
            if ("U".equals(s)) {
                y++;
            } else if ("D".equals(s)) {
                y--;
            } else if ("L".equals(s)) {
                x--;
            } else {
                x++;
            }
            
            calculateDir(x, y);
        }
        
        return answer;
    }
    
    private static void calculateDir(int x, int y) {
        String prevDir = dir[0] + "," + dir[1];
        if (!(Math.abs(dir[0] + x) > 5) && !(Math.abs(dir[1] + y) > 5)) {    
            dir[0] += x;
            dir[1] += y;   
            String nowDir = dir[0] + "," + dir[1];
            
            if (!list.contains(prevDir + nowDir) && !list.contains(nowDir + prevDir)) {
                list.add(prevDir + nowDir);
                list.add(nowDir + prevDir);    // 되돌아가는 경우 - 경로 겹침.
                answer++;
            }
        }
    }
}
