package Practise;

public class LargestPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String[] input = {"geeks", "geeksforgeeks", "geek", "geezer"};
		
		 int n = input.length;
	       // take temp_prefix string and assign first element of arr : a.
	       String result = input[0];
	       
	       // Iterate for rest of element in string.
	       for(int i = 1; i < n; i++){
	            // .indexOf() return index of that substring from string.
	            while(input[i].indexOf(result) != 0){
	               
	                // update matched substring prefx
	                result = result.substring(0, result.length()-1);
	               
	                // check for empty case. direct return if true..
	                if(result.isEmpty()){
	                    System.out.println("No prefix");
	                }
	            }
	        }
	       System.out.println("Ourput is "+result);
	        

	}

}
