package Arrays;

import java.util.*;

public class TrappingRainWater {


	public  static  int trappingRainWater(int[] arr, int n){

		int[] lMax = new int[n];
		int[] rMax = new int[n];
		 lMax[0] = arr[0];
		 rMax[n - 1] = arr[n-1];

		 for(int i =  1; i<n ;i++){
		lMax[i] = Math.max(lMax[i - 1], arr[i]);
		 }

		 for(int j = n -2; j>=0; j--){

		 	rMax[j] = Math.max(rMax[j + 1], arr[j]);
		 }

		 int ans = 0;

		 for(int i = 1; i<n -1; i++){

		 	ans += Math.min(lMax[i], rMax[i]) - arr[i];
		 }

		 return ans;

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr;
		arr = new int[n];

		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}

		System.out.println(trappingRainWater(arr, n));
	}
}