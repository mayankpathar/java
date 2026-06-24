package lab4;

import java.util.Scanner;

public class a5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String text = scanner.nextLine();

		for (int i = 1; i <= text.length(); i++) {
			System.out.println(text.substring(0, i));
		}

		scanner.close();
	}
    
}
