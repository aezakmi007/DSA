import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ALL_PRIME_NUMBERS_SMALLER_THAN_GIVEN_NUMBER_SEIEVE_OF_ERATOSTHENES {


	public static  void lessEfficientMethod(int n){

		for(int i = 2; i<=n; i++){

			if(PRIMENUMBER.isPrime(i)){

				System.out.println(i);
			}
		}
	}

	public static  void seieveOfErtosthenes(int n){

		boolean isPrime[] = new boolean[n + 1];
		Arrays.fill(isPrime, true);

		for(int i = 2; i*i <= n; i++){

			if(isPrime[i]){

//				System.out.println(i);
				for(int j = 2 * i; j<=n; j +=i){

					isPrime[j] = false;
				}
			}
		}

		for(int i = 2 ;i<=n ; i++){

			if(isPrime[i]){
				System.out.println(i);
			}
		}
	}

	public static void main(String args[]){

		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();

		lessEfficientMethod( n);
		seieveOfErtosthenes(n);
	}


}
