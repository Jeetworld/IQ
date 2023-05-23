package Practise;

public class RevreseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		
		String s  ="this is kamal";
		
		String[] rev = s.split(" ");
		String output ="";
		for(int i=rev.length-1; i>=0; i--) {
			output = output + rev[i] + " ";
		}
		
		System.out.println("Output is "+output);

	}

}
