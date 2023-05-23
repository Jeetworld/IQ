package IQ.IQ;

import java.util.Arrays;

import org.openqa.selenium.By;

public class TestFour {
	
	
	public static void main(String[] args) {
		
		
		int[] arr= {12, 45, 1, -1, 0, 4, 56, 23, 89, -21, 56, 27};
		int temp;
		for(int i=0; i<arr.length; i++) {
			for(int k=i+1; k<arr.length; k++) {
				if(arr[i]>arr[k]) {
					temp=arr[i];
					arr[i]=arr[k];
					arr[k]=temp;
					
				}
			}
		}
		Arrays.sort(arr);
		System.out.println("result is "+Arrays.toString(arr));
		//Arrays.sort(arr);
		
		
	}
	
}
