package test1;

import java.util.Scanner;

/**
 * @author Lyon
 *
 */
public class HOMEWORK_4 {
	private static Scanner scanner;

	public static void main(String[] args) {
		System.out.println("Calculate aquare root");
		System.out.println("Please input a integer:");
		scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		double y = Math.sqrt(a);
		System.out.println("Result:");
		System.out.println(y);
	}

}
