package Arrays;

import java.util.Scanner;

public class ReverseTheArray {
public static  int[] reverseTheArray(int arr[], int n){

	int low = 0;
	int high  = n -1;

	while(low < high){

		int temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;
	}

	return arr;
}
	public static  void main(String args[]) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		reverseTheArray(arr, n);
	}
}
