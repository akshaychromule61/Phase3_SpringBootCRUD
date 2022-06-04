package src.string.anagram.program;

import java.util.Arrays;

public class StringAnagrm {
	public static boolean isAnagram(String str1, String str2) {
        str1=str1.replaceAll("\\s", "");
        str2=str2.replaceAll(" ", "");
        if(str1.length()!=str2.length()) {
        	return false;
        }else {
        	char[] c1 = str1.toLowerCase().toCharArray();
        	char[] c2=  str2.toLowerCase().toCharArray();
        	Arrays.sort(c1);
        	Arrays.sort(c2);
        	return Arrays.equals(c1, c2);
        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using uquals and sort method
		//using builder and hashpam
		String str1="Tom Marvolo Riddle";  
        String str2="I am Lord Voldemort"; 
        System.out.println(isAnagram("keep","peeks"));
	}

}
