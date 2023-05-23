package Practise;

public class DuplicateWordsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "this is kamal why is kamal";
		String[] sa = s.split(" ");
		int count;
		for(int i=0; i<sa.length; i++) {
			count=1;
			for(int j=i+1; j<sa.length; j++) {
				if(sa[i].equals(sa[j]) ) {
					count++;
					sa[j]="0";
				}
			}
			
			if(count>1 && sa[i]!="0") {
				System.out.println("Duplicate "+sa[i]);
			}
		}

	}

}
