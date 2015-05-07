/**
 * 
 */
package test1;

import java.util.Scanner;

/**
 * @author Lyon
 *
 */
public class HOMEWORK_2 {
	private static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		System.out.println("Please input three patameter:");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		if (a > b && a > c) {
			System.out.println("The maximal value is:");
			System.out.println(a);
		} else if (b > a && b > c) {
			System.out.println("The maximal value is:");
			System.out.println(b);
		} else {
			System.out.println("The maximal value is:");
			System.out.println(c);
		}
	}

}
