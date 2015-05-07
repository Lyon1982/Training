package test1;

/**
 * @author Lyon
 *
 */
public class HOMEWORK_1 {

	public static void main(String[] args) {

		for (int a = 1; a <= 100; a++) {
			int b = a % 7;
			int c = a % 10;
			if (b == 0 || c == 7) {
				System.out.println(a);
			}
		}

	}

}
