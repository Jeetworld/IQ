package IQ.IQ;

import java.util.Arrays;

public class TestSix {

	public static void main(String[] args) {
		
		String s="Kamaljit singh (1234)";
		char[] ch = s.toCharArray();
		//System.out.println("Result is "+s.replaceAll("[^0-9]", ""));
		
//		for(int i=0; i<ch.length; i++) {
//			if(ch[i]=='(') {
//				while(ch[i]!=')') {
//					System.out.println("result is "+ch[i]);
//					
//				}
//			}
//			
//		}
		int count =0;
		String result="";
		for(int i=0; i<ch.length; i++) {
			count=1;
			for(int k=i+1; k<ch.length; k++) {
				if(ch[i]==ch[k]) {
					//result = result +ch[i];
//					System.out.println("result "+ch[i]);
//					break;
					count++;
				}
			}
			if(count==1) {
				//System.out.println("Result is "+ch[i]);
				result = result +ch[i];
			}
		}
		
		System.out.println(result);
		
	}

}
