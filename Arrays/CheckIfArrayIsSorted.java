package Arrays;

import java.util.Scanner;

public class CheckIfArrayIsSorted {

	public static boolean isArraySorted(int arr[], int n){

		for(int i = 0; i<n - 1; i++){

			if(arr[i] > arr[i + 1]){

				return false;
			}
		}

		return true;
	}

	public static  void main(String args[]){


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for(int i = 0; i<n ; i++){
			arr[i] = sc.nextInt();
		}

		System.out.println(isArraySorted(arr, n));


	}
}
