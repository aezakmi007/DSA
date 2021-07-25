package Arrays;

import java.util.Scanner;

public class MaxiMumDifference {

	public  static  int maxDiff(int arr[], int n){

		int res = arr[1]  - arr[0];
		int min = arr[0];

		for(int i = 1; i<n ; i++) {

			res = Math.max(res, arr[i] - min);
			min = Math.min(min, arr[i]);
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[] = new int[n];

		for(int i = 0; i<n; i++){

			arr[i] = sc.nextInt();
		}

		System.out.println(maxDiff(arr, n));
	}
}