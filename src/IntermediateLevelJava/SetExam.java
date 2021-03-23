package IntermediateLevelJava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
	public static void main(String[] args){
        Set<String> set = new HashSet<String>();
        set.add("a");
        set.add("a");
        set.add("b");
        
        System.out.println("set의 내용을 출력합니다.");
        
        Iterator<String> iter = set.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            System.out.println(str);
        }
    }
}
