package Day2;

import java.util.Scanner;

public class largestElement {
	public static void main(String[] args) {
		//Approach 2
		Scanner sc = new Scanner(System.in);
		System.out.println("give the size of the array");
		int size= sc.nextInt();
		int arr[]= new int[size];
		System.out.println("Give the elements of the array");
		for (int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
			
		}
		int greatest = -1;
		for (int i=0; i<size; i++) {
			if (arr[i]>greatest) {
				greatest = arr[i];
			}
		}
		System.out.println("Greatest element is: "+ greatest);
	}
	
	
}
