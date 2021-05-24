import java.util.Scanner;

public class ALL_DIVISORS {


	public static void naiveMethod(int n){

		for(int i = 1; i<=n ; i++){

			if(n % i == 0){

				System.out.println(i);
			}
		}
	}

	public static void efficientMethod(int n){

		for(int i = 1; i<=Math.sqrt(n); i++){

			if(n % i == 0){

				System.out.println(i);
				if( i != n/i){

					System.out.println( n / i);
				}
			}
		}
	}

	public static  void moreEfficientMethod(int n){

		int i = 0;
		for(i = 1; i< Math.sqrt(n); i++){

			if(n % i == 0){

				System.out.println(i);
			}
		}

		for(; i>=1; i--){

			if(n % i == 0){

				System.out.println(n / i);
			}
		}
	}


	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

//		naiveMethod(num);//Theta(n);
		efficientMethod(num);//Theta(n  n^ 1/2);
//		moreEfficientMethod(num);//Theta(n ^ 1 / 2);
	}
}
