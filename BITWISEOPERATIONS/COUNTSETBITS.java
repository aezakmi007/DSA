package BITWISEOPERATIONS;

import java.util.Scanner;

public class COUNTSETBITS {

	public static int setBits(int n){

		int count = 0;
		while(n > 0 ){

			count =  ((n & 1) == 1) ? ++count  : count;
			 n =  n >> 1;

		}

		return count;
	}

	public static int BrianKerningamAlgorith(int n){

		int count = 0;

		while(n > 0){

			n = n & ( n - 1);
			count++;
		}

		return count;
	}

	public  static  void  main(String args[]){

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		System.out.println(setBits(num));

		//using Brian Kerningam's Algorithm

		System.out.println(BrianKerningamAlgorith(num));
	}
}
