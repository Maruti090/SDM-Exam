import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter first number");
		int a = sc.nextInt();
		System.out.println("Please Enter second number");
		int b = sc.nextInt();
		if(a > b)
			System.out.println("largest number = " + a);
		else
			System.out.println("largest number = " + b);

	}

}
