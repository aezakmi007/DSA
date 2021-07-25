package Arrays;

import java.util.*;

public class StockBuyAndSellProblem {

	public static  int maxiMumProfit(int arr[], int n){

		int profit = 0;

		for(int i = 1; i<n;i++){

			if(arr[i] > arr[i - 1]){

				profit += arr[i] - arr[i - 1];
			}
		}

		return profit;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for(int i = 0; i<n; i++){

			arr[i] = sc.nextInt();
		}

		System.out.println(maxiMumProfit(arr, n));
	}
}