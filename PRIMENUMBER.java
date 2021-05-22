import java.util.Scanner;



public class PRIMENUMBER {


	//	Less Efficient Method
	public static boolean isPrime2(int n){

		if(n <= 1){

			return false;
		}

		for(int i = 2; i*i <= n; i++){


			if(n % i == 0){

				return false;
			}
		}

		return true;
	}

	//Efficient Method
	public static boolean isPrime(int n){

		if( n == 1){

			return false;
		}
		if(n == 2 || n == 3){

			return true;
		}

		if(n % 2 == 0 || n % 3 == 0){

			return false;
		}

		for(int i = 5; i * i <=n ;i++){

			if(n % i == 0){

				return false;
			}
		}

		return true;
	}

public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();

	System.out.println(isPrime(n));
}
}
