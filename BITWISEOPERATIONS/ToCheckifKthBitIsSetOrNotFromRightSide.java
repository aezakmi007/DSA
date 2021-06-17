package BITWISEOPERATIONS;

import java.util.Scanner;

public class ToCheckifKthBitIsSetOrNotFromRightSide {


	public static  String kthbitste(int n, int k){

		return (n & (1 << (k-1))) != 0 ? "YES" : "NO";

	}

public  static String rightShiftkthbitste(int n , int k){

		return ((n >> (k -1) & 1) == 1 ? "YES" : "NO" );
}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();


		//using left Shift
		System.out.println(kthbitste(n, k));

		//using right shift
		System.out.println(rightShiftkthbitste(n, k));


	}
}
