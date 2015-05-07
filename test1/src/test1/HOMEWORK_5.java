/**
 * 
 */
package test1;

import java.util.Scanner;

/**
 * @author Lyon
 *
 */
public class HOMEWORK_5 {
	private static Scanner scanner;

	public static void main(String[] args) {
		System.out.println("Calculate submultiple");
		System.out.println("Please intput parameter:");
		scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		System.out.println("Results:");
		for (int y = 1; y <= x; y++) {
			int z = x % y;
			if (z == 0) {
				System.out.println(y);
			}
		}
	}

}
