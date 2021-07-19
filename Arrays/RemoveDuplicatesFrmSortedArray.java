package Arrays;

import java.util.Scanner;

public class RemoveDuplicatesFrmSortedArray {

	public static  void removeDuplicates(int  arr[], int n){

		int res = 1;
		for(int i = 1; i<n; i++) {

			if (arr[i - 1] != arr[i]) {
				arr[res] = arr[i];
				res++;
			}
		}
	}

	public static  void main(String args[]) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
	removeDuplicates (arr, n);
	}

}
