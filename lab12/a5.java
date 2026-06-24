package lab12;

import java.util.Scanner;

class OutOfRangeException extends Exception {
	public OutOfRangeException(String a) {
		super(a);
	}
}

public class a5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		try {
			if (n < 10 || n	 > 50) {
				throw new OutOfRangeException("Out of range. Number must be between 10 and 50.");
			}

			int square = n * n;
			System.out.println("Square of number is: " + square);
		} catch (OutOfRangeException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}
}
