package BITWISEOPERATIONS;

import java.util.Scanner;

public class POWEROFTWO {

	public static boolean ispowerOfTwo(int num){

		 return (num & (num - 1)) == 0;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();


		System.out.println(ispowerOfTwo(n));

	}
}
