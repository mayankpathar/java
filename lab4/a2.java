package lab4;

public class a2 {
	public static void main(String[] args) {
		int[] values = {10, 20, 30, 40};
		int sum = 0;

		for (int value : values) {
			sum += value;
		}

		double average = (double) sum / values.length;
		System.out.println("Average of array values: " + average);
	}
    
}
