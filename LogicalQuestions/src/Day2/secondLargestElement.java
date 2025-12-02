package Day2;

import java.util.Scanner;

public class secondLargestElement {
	public static void main(String[] args) {
		//Approach 1
		Scanner sc= new Scanner(System.in);
		System.out.println("Give the size of the array");
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Give the elements of the array");
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		int largest;
		int second_largest;
		if (arr[0]>arr[1]) {
			largest = arr[0];
			second_largest=arr[1];
		}
		else {
			largest=arr[1];
			second_largest=arr[0];
		}
		for (int i=2; i<size; i++) {
			if(arr[i]>largest) { 
				second_largest = largest;
				largest = arr[i];
				
			}
			else if (arr[i]>second_largest) {
				second_largest=arr[i];
				
			}
		}
		System.out.println("Second largest element is" + second_largest);
	}

}
