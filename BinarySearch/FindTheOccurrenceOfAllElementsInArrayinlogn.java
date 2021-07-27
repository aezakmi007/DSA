package BinarySearch;

import java.util.*;

public class FindTheOccurrenceOfAllElementsInArrayinlogn {

	public  static  int firstOccurence(int[] arr, int n, int key){

		int low = 0;
		int high = n - 1;

		while(low<=high){

			int mid = (low + high )/ 2;

			if(arr[mid] == key){
				if(mid == 0 || arr[mid - 1] != arr[mid])
				return mid;
				else{
					high  = mid - 1;
				}
			}else if(arr[mid] < key){

				low = mid + 1;
			}else{

				high = mid - 1;
			}
		}
		return -1;
	}

	public static int lastoccurence(int[]arr, int n, int key){

		int low = 0;
		int high = n - 1;

		while(low<=high){

			int mid = (low + high )/ 2;

			if(arr[mid] == key){
				if(mid == n-1 || arr[mid + 1] != arr[mid])
					return mid;
				else{
					low  = mid + 1;
				}
			}else if(arr[mid] < key){
				low = mid + 1;
			}else{

				high = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int key = sc.nextInt();
		for(int i = 0;i <n; i++){

			 arr[i] = sc.nextInt();
		}

		int first = firstOccurence(arr, n, key);
		if(first == -1){

			System.out.println((-1));
		}else{

			System.out.println(lastoccurence(arr, n, key) - first + 1);
		}
	}
}