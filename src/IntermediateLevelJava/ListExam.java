package IntermediateLevelJava;

import java.util.ArrayList;
import java.util.List;

public class ListExam {
	public List<String> addArray(String[]arr1, String[]arr2){
        List<String> list = new ArrayList<String>();
        
        for(String str : arr1){
            list.add(str);
            //System.out.println(str);     
        }
        
        for(String str : arr2){
            list.add(str);
            //System.out.println(str);
        }
        
        return list;
    }
    
    public static void main(String[] args){
        String[] arr1 = {"Hello", "JAVA", "World"}; 
        String[] arr2 = {"Happy", "New", "Year"};
        ListExam exam = new ListExam();
        List<String> resultList = exam.addArray(arr1, arr2);
        for (String str : resultList) {
            System.out.println(str);
        }
    }
}
