package test1;

import java.util.Scanner;

/**
 * @author Lyon
 *
 */
public class HOMEWORK_3 {

	private static Scanner scanner;

	public static void main(String[] args) {

		System.out.println("Transform Decimal Number to Binary Number");
		System.out.println("Please input a decimal number:");
		scanner = new Scanner(System.in);
		int inputnum = scanner.nextInt();
		String outputnum = Integer.toBinaryString(inputnum);
		System.out.println("Result:");
		System.out.print(outputnum);

	}

}
