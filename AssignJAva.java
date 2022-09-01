package javaspecification;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class AssignJAva {
//	ques 1
	public static void print50() {
		for(int i=1;i<=50;i++) {
			System.out.println(i);
		}
	}
// ques 3	
	public static void greaterthan3(List<String>list) {
		int c=0;
		for(String count:list) {
			if(count.length()>3) {
				c++;
			}
		}
		System.out.print("greater than 3 count is "+c);
	}
	
// ques 4
	
	public static void upperCase(List<String>list) {
		for(int i=0;i<list.size();i++) {
			
			String character=list.get(i);
			list.set(i,character.toUpperCase());
				
			}
		for(String s : list) {
        	System.out.println(s);
        }
		
		}
// ques 2
    public static void remove(List<String>list) {
    	 HashSet<String> hash = new HashSet(list);
 	    
  	   
 	    
 	    //iterate through HashSet
 	    for(String Names :hash)
 	      System.out.println(Names);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print50();
		System.out.println();
		List<String> name=Arrays.asList("shubham","ab","sourav","ab");
		greaterthan3(name);
		System.out.println();
		upperCase(name);
		System.out.println();
		remove(name);

	}

}
