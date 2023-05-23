package IQ.IQ;

public class DB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="i am an automation tester";
		String[] input =str.split(" ");
		
		String result="";
		for(int i=input.length-1; i>=0; i--) {
			result+= input[i] + " ";
		}
		
		System.out.println("Result is "+result);
		
		
	}

}
