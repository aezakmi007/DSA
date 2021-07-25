package Arrays;

import java.util.Scanner;

public class Moveszerostilltheend {
 public static void movesZerosTillTheEnd(int[] arr, int n){

 	int count = 0;

 	for(int i = 0; i<n; i++){

 		if(arr[i] != 0){

 			int temp = arr[i];
 			arr[i] = arr[count];
 			arr[count] = temp;
 			count++;
	    }
    }
 }


public static void main(String[]args) {

	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[] = new int[n];

	for (int i = 0; i < n; i++) {
		arr[i] = sc.nextInt();
	}
	movesZerosTillTheEnd(arr, n);

	for(int x : arr){
		System.out.print(x + " ");
	}

}


}
