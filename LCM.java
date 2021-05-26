import java.util.Scanner;

public class LCM {

public static int GCD(int a, int b){

	if(b == 0){

		return a;
	}

	return GCD(a, b % a);
}
	public static int LCM(int a, int b){

	int product = a * b;
	return product / GCD(a, b);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		System.out.println(LCM(num1, num2));

	}
}
