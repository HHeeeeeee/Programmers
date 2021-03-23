package CodingTest;

import java.util.Arrays;

public class HashEx1_player {
	public static void main(String[] args) {
		/*String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"leo", "kiki"};*/
		
		/*String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = {"josipa", "filipa", "marina", "nikola"};*/
		
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		HashEx1_player player = new HashEx1_player();
		String result = player.solution(participant, completion);
		System.out.println(result);
	}

    public String solution(String[] participant, String[] completion) {
    	String result = "";
    	Arrays.sort(participant);
    	Arrays.sort(completion);

    	for (int i = 0; i < completion.length; i++) {
    		if (!completion[i].equals(participant[i])) {
    			result = participant[i];
    			break;
    		}
    	}

    	if ("".equals(result)) {
    		result = participant[participant.length-1];
    	}
    	
    	return result;
    }
}
