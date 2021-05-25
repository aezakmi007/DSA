import java.util.Scanner;

public class FACTORIAL {


	public static int factorial(int n){

		if(n == 1 || n == 0){
			return 1;
		}

		return n * factorial(n - 1);
	}

	public static void main(String[] args){

		Scanner sc =  new Scanner(System.in);
		int Num = sc.nextInt();

		System.out.println(factorial(Num));
	}
}
