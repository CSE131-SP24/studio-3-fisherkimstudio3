package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Type a random positive integer n: ");
		int n = in.nextInt();
		boolean[] primeCheck = new boolean[n];
		
		int index = 0;
		while (index < n) {
			primeCheck[index] = true;
			index ++;
		}
		
		int number = 2;
		while (number <= Math.sqrt(n)) {
			int multiple = 2;
			while (number * multiple <= n) {
				primeCheck[number * multiple - 1] = false;
				multiple ++;
			}
			number ++;
		}
		
		index = 1;
		while (index < n ) {
			if (primeCheck[index] == true)
			{
				System.out.println(index + 1);
			}
			else
			{
			}
			index ++;
		}
	}
}