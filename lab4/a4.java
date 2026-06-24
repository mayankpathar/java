package lab4;

public class a4 {
    public static void main(String[] args) {
        int[] values = {10, 20, 30, 40, 50};
        int max = values[0];
        int min = values[0];

        for (int value : values) {
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
