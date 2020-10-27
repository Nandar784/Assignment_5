package Hello;

import java.util.Scanner;

public class mountain_pattern {

	public static void main(String[] args) {

		int i, j, x = 2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows");
		int row = sc.nextInt();

		for (i = row; i > 0; i--) {
			for (j = 0; j < row + 1; j++) {
				System.out.print("  ");
				if (j == i) {
					for (int a = 1; a < x; a++) {
						System.out.print(" " + a);
					}
					x += 2;
				}

			}
			System.out.println();
		}

	}

}
