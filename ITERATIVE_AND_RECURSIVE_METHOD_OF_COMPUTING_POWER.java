import java.util.Scanner;

public class ITERATIVE_AND_RECURSIVE_METHOD_OF_COMPUTING_POWER {

	public static int recursivePowerCalculation(int n ,int power){

		if(power == 0){
			return 1;
		}

		int temp = recursivePowerCalculation(n, power/2);
		temp = temp * temp;
		if(power % 2 == 0){

			return temp;
		}else{
			return temp * n;
		}
	}

	public  static  int iterativePowerCalculation(int n , int power){

		int res = 1;

		while(power > 0){

			if(power % 2 != 0){

				res = res * n;
			}
			n = n * n;
			power = power / 2;
		}
		return res;
	}




	public static void main(String args[]){

		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int power = sc.nextInt();

		System.out.println(recursivePowerCalculation(n, power));
		System.out.println(iterativePowerCalculation(n, power));

	}


}
