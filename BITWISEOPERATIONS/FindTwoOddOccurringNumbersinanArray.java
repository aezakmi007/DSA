package BITWISEOPERATIONS;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class FindTwoOddOccurringNumbersinanArray {

	public static int[] findthenumbers(int arr[]){

		int res = 0;

		for(int i = 0; i<arr.length; i++){

			res = res ^ arr[i];
		}

		int sn= 0;
		sn = res & (~(res- 1));
		int num1 = 0;
		int num2 = 0;
		for(int i = 0; i<arr.length; i++){

			if((arr[i] & sn) != 0){
				num1 = num1 ^ arr[i];
			}else{
				num2 = num2 ^ arr[i];
			}

		}

		int ans[] = {num1, num2};
		return ans;
	}

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];
		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}

		int ans[] = findthenumbers(arr);

		for(Integer x : ans){
			System.out.println(x);
		}
	}
}
