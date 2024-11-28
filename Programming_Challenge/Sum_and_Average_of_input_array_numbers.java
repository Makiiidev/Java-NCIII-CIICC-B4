import java.util.Scanner;

public class Sum_and_Average_of_input_array_numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the array length: ");

        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.print("First number: ");

        for (int i = 0; i < n; i++) {
            if(i > 0) System.out.print("Next number : ");
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        double average = (double) sum / n;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        
    }
}