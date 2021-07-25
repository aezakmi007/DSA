package Arrays;

import java.util.Scanner;

public class LeftRotateByD {

	public static void letRotateBydMethod1(int [] arr, int n, int d){


		int temp[] = new int[d];

		for(int i = 0; i<d; i++){

			temp[i]= arr[i];
		}

		for(int j = d; j<n; j++){

			arr[j - d] = arr[j];
		}

		for(int k = 0; k<n; k++){

			arr[n - d + k] = temp[k];
		}

	}
public static  void leftRotateBydMethod2(int arr[] ,int n , int d){

		reverse(arr, 0, d-1);
		reverse(arr, d, n - 1);
		reverse(arr, 0, n - 1);



}

public static  void reverse(int arr[], int high, int low){

		while(low < high){

			int temp = arr[high];
			arr[high] = arr[low];
			arr[low] = temp;
			low++;
			high--;
		}
}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		letRotateBydMethod1(arr, n, d);
		leftRotateBydMethod2(arr, n, d);
	}
}
