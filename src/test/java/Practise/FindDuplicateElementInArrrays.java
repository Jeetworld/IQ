package Practise;

public class FindDuplicateElementInArrrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a1 = { 33,2,2,27,11,5,6,225};
		int[] a2 = { 334,551,22,3,2,11,5};
		int[] a3 = { 333,555,2,113,5};
		
		for(int i=0; i<a1.length; i++) {
			for(int j=0; j<a2.length; j++) {
				for(int k=0; k<a3.length; k++) {
					if(a1[i]==a3[k] && a1[i]==a2[j]) {
						//System.out.println("Duplicate is "+a1[i]);
						a1[i]='A';
						a2[j]='A';
						a3[k]='A';
					}
				}
			}
			if(a1[i]!='A')
			System.out.println("Duplicate is "+a1[i]);
		}

	}

}
