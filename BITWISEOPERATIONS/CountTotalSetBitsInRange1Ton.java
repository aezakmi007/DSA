package BITWISEOPERATIONS;

import java.util.Scanner;

public class CountTotalSetBitsInRange1Ton {


	public static int count(int n ){

		n++;
		int power = 2;
		int count = n / 2;

		while(power <= n){

			int totalBits = n / power;
			count += (totalBits / 2) * power;
			count += totalBits % 2 != 0 ? n % power : 0;
			power = power * 2;
		}

		return count;
	}
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(count(n));
	}
}
