package lab4;

import java.util.Scanner;

public class a1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter array size: ");
		int size = sc.nextInt();

		int[] values = new int[size];
		int sum = 0;
        
		System.out.println("Enter array elements:");
		for (int i = 0; i < values.length; i++) {
			values[i] = scanner.nextInt();
			sum += values[i];
		}

		System.out.println("Sum of array values: " + sum);
		scanner.close();
	}
    
}
