package codingTset;

import java.util.HashMap;
import java.util.Map;

public class Disguise {

	public static void main(String[] args) {
		String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
		int result = solution(clothes);
		System.out.println(result);
	}
	
    public static int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }
        
        for (String key : map.keySet()) {
            answer *= map.get(key) + 1;     // 이 옷을 안입은 경우도 포함시켜주기    
        }
        answer -= 1;    // 전부 다 안입은 경우 빼기
        
        return answer;
    }
}
