import java.util.Scanner;

public class Check_whose_largest_number_in_3_inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] threeNumbers = new int[3];

        System.out.println("Input 3 Numbers to check who is the most largest number");

        System.out.print("First Number : ");
        threeNumbers[0] = sc.nextInt();

        System.out.print("Second Number : ");
        threeNumbers[1] = sc.nextInt();

        System.out.print("Third Number : ");
        threeNumbers[2] = sc.nextInt();

        int largestNumber = threeNumbers[0];

        for(int i=1; i < threeNumbers.length; i++){
            if (threeNumbers[i] > threeNumbers[0] ) 
                largestNumber = threeNumbers[i];

        }

        System.out.println("The Largest Number is : " + largestNumber);

    }
}
