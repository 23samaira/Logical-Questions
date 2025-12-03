package Day3;

import java.util.Scanner;

public class factorCount {
	public static int factorCount(int n) {
		int count=0;
		for (int i=1; i*i<=n; i++) {
			if(n%i==0) {
				if (n/i==i) {
					count ++;
				}
				else {
					count+=2;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
		int sol=factorCount(n);
		System.out.println(sol);
	}

}
