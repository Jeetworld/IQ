package IQ.IQ;

public class testeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input ="I am not String";
		 
		//o/p-"g ni rtS tonmaI"
		 
		 char[] ch = input.toCharArray();
		 
		 for(int i=ch.length-1; i>=0; i--) {
			 
//			 if(i%2==0) {
//			 System.out.print(" ");
//			 }
			 System.out.print(" ");
			 for(int k =1; k<ch.length; k++) {
			 System.out.print(ch[i]);
			 
			 }
			
//			 for(int j =i*1; j<ch.length; j++) {
//				 System.out.print(" ");
//			 }
			 
		 }
	}

}

//i=1
//""
//i=2
//""
//i=3

