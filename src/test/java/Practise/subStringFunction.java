package Practise;

public class subStringFunction {
	
	 static boolean hasRepeatedSubstring(String str)
	    {
	        int n = str.length();
	        String pattern = str.substring(1) + str.substring(0,n-1);
	        return pattern.contains(str);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stubg
		
		String s ="HellHellHell";
		System.out.println(s.substring(1));
		if(subStringFunction.hasRepeatedSubstring(s))
			System.out.println("true");
		else
			System.out.println("false");
		
		
		
		

	}

}
