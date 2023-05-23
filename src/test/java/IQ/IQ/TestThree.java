package IQ.IQ;

public class TestThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("hello");
		String str ="POPP";
		char[] ch = str.toCharArray();
		String result="";
		for(int i=ch.length-1; i>=0; i--) {
			result = result + ch[i];
		}
		//System.out.println("result is "+result);
		
		if(result.equals(str)) {
			System.out.println("Your input is pallindrome");
		}else
			System.out.println("Your input is not pallindrome");

	}

}
