package Arrays;

import java.util.*;

public class MaxiMumConsecutiveOnes {

	public static  int maxiMumConsecutivOnes(int[] arr, int n){

		int maxTillNow = 0;
		int max = 0;

		for(int i = 0; i<n ; i++){

			if(arr[i] == 1){

				maxTillNow++;
			}else{
				max = Math.max(max, maxTillNow);
				maxTillNow = 0;
			}

		}

		max = Math.max(max, maxTillNow);
		return max;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for(int i = 0; i<n; i++)
			arr[i] = sc.nextInt();

		System.out.println(maxiMumConsecutivOnes(arr, n));
	}
}