package Practise;

import java.util.Scanner;

public class BuzzFizz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			
			if(i%3==0 || i%5==0) {
				System.out.println("Buzzfizz");
			}
			else
				System.out.println(i);
		}

	}

}
