
import java.util.ArrayList;
import java.util.Scanner;

public class Sum_of_all_integer_input {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.println();
        System.out.print("Input number : ");
        int input = sc.nextInt();
        list.add(input);

        boolean isAddInput = true;

        while (isAddInput) {

            System.out.print("Do you want to add more? press Y for yes if no press N : ");
            String pick = sc.nextLine();

            if (pick.equalsIgnoreCase("y")) {
                System.out.println();
                System.out.print("Input number : ");
                input = sc.nextInt();
                list.add(input);

            } else if (pick.equalsIgnoreCase("n")) {
                int sum = 0;
                for (int num : list) {
                    sum+= num;
            }
        System.out.println();
        System.out.println("The sum of all input is : " + sum);
        isAddInput = false;
            
            }
        }

    }
}