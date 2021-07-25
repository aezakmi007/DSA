package Arrays;

import java.util.Scanner;

public class LeaderInTheArray {

	public  static void leadersintheArray(int arr[], int n){

		int largest = arr[n-1];

		System.out.print(largest + " ");
		for(int i = n - 2; i>=0; i--){
			if(largest < arr[i]){

				largest = arr[i];
				System.out.print(largest + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for(int i  = 0;i<n; i++){
			arr[i] = sc.nextInt();
		}
		leadersintheArray(arr, n);
//		int ans[] =
//		for(int x : ans){
//			System.out.print(x + " ");
//		}
	}
}