package lba6;
import java.util.Arrays;
import java.util.Scanner;

class A {
    int[] arr = {10, 50, 30, 20, 40};

   
    void sortArray() {
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    
    void searchArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
        sc.close();
    }

    
    void sumArray() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of Array: " + sum);
    }

    
    void avgArray() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;
        System.out.println("Average of Array: " + avg);
    }
}

class A4 {
    public static void main(String[] args) {
        A obj = new A();   

        obj.sortArray();
        obj.searchArray();
        obj.sumArray();
        obj.avgArray();
    }
}
