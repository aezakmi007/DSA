package Arrays;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.*;

public class FrequencyInSortedArray {

	public static  void frequencyInSortedArray(int arr[], int n){

		int count  = 1;
		int ele  = arr[0];

		for(int i = 1; i<n ; i++){

			if(arr[i] == ele){
				count++;
			}else{
				System.out.println(ele + " " + count);
				count= 1;
				ele = arr[i];
			}
		}

		System.out.println(arr[n - 1]+" "+ count);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int arr[] = new int[n];

		for(int i = 0; i<n ; i++){

			arr[i] = sc.nextInt();
		}

		frequencyInSortedArray(arr ,n);
	}
}