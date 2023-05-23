package Practise;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		

		// TODO Auto-generated method stub
		boolean status;
		String str1 ="DOQNY IS A ROY";
		String str2 ="DONYQ IS A YOR";
		
		str1= str1.replaceAll("\\s", "");	//elimnate the space in sentence with "\\s"
		str2= str2.replaceAll("\\s", "");
		
		char[] ch1 = str1.toLowerCase().toCharArray();
		char[] ch2 = str2.toLowerCase().toCharArray();
		
		System.out.println("Before sorting "+Arrays.toString(ch1));
		System.out.println("Before sorting "+Arrays.toString(ch2));
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		System.out.println("After sorting "+Arrays.toString(ch1));
		System.out.println("After sorting "+Arrays.toString(ch2));
		
		status = Arrays.equals(ch1, ch2);
		System.out.println("result is "+status);
		
		String str112 = "java is fun";

	    // extract substring from index 0 to 3
	    System.out.println(str112.substring(0, 4));
	    System.out.println(str112.substring(2));
		
		

	
		// TODO Auto-generated method stub

	}

}
