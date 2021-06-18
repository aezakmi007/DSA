package BITWISEOPERATIONS;

import java.util.Scanner;

public class GeneratingSubsetsOfaString {

	public static void subsets(String s){

		int counter = 0;
		double power = Math.pow(2, s.length());

		for(counter = 0; counter < power; counter++){

			for(int j = 0; j<s.length(); j++){

				if((counter & (1 << j)) != 0){

					System.out.print((s.charAt(j)));
				}
			}

			System.out.println();
		}
	}


	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		subsets(s);
	}
}
