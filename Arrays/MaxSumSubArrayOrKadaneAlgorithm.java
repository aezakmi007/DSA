package Arrays;

import java.util.*;

public class MaxSumSubArrayOrKadaneAlgorithm {
public static  int maxSum(int[] arr, int n){
	int maxEnding = arr[0];
	int res = 0;
	for(int i = 1; i<n ; i++){

		maxEnding = Math.max(maxEnding + arr[i], arr[i]);
		res = Math.max(res, maxEnding);
	}
	return res;
}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr= new int[n];

		for(int i = 0; i<n ; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println(maxSum(arr, n));
	}
}