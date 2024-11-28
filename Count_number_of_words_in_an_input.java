import java.util.Scanner;

public class Count_number_of_words_in_an_input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter some words : ");
        String input = sc.nextLine();

        String [] count = input.trim().split("\\s+");


        System.out.println("NUmber of Words is : " + count.length);

    }
}
