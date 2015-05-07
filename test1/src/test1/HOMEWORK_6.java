/**
 * 
 */
package test1;

import java.util.Scanner;

/**
 * @author Lyon
 *
 */
public class HOMEWORK_6 {
	private static Scanner scanner;

	public static void main(String[] args) {
		System.out.println("Even number or Odd number");
		System.out.println("Please input parameter:");
		scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = a % 2;
		if (b == 0) {
			System.out.println("It is a even number");
		} else {
			System.out.println("It is an uneven number");
		}

	}
}
