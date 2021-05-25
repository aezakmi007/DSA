import java.util.Scanner;

public class TRAILING_ZEROS_IN_FACTORIAL {



	public static int lessefficentTrailinZeros(int n){
		int fact = 1;
		for(int i = 2; i<=n; i++){

			fact = fact * i;
		}
		int count = 0;
		while(fact % 10 == 0){

			count++;
			fact = fact / n;
		}

		return count;
	}

	public static int moreEfficientTrailingZeros(int n){


		int res = 0;
		for(int i = 5 ;i<=n; i*=5){

			res += n / i;

		}
		return res;
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

//		System.out.println(lessefficentTrailinZeros(n));
		System.out.println(moreEfficientTrailingZeros(n));


	}
}
