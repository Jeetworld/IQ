package Practise;

public class FirstChar {

	public static void main(String[] args) {
		
		   // create StringBuilder object to store converted strings
        StringBuilder sbuilder = new StringBuilder();
 
        // sample string
        String str = "welcome to java";
 
        // create StringTokenizer with above content
        String[] strArray = str.split("\\s");
 
        for(int index=0; index < strArray.length; index++) {
 
            // store it in temporary variable
            String temp = strArray[index];
 
            // convert 1st character into upper-case
            String firstUppercase = Character.toUpperCase(
                    temp.charAt(0)) + temp.substring(1);
 
            // add converted string first
            sbuilder.append(firstUppercase);
 
            // and then add single space
            sbuilder.append(" ");
        }
 
        // finally pretty print to console
        System.out.println(sbuilder.toString().trim());

	}

}
