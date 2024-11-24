import java.util.Scanner;

public class String_Builder_10_Characters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("String Builder - 10 Characters");
        System.out.println();
        System.out.println("Enter a String of at least 10 characters");

        String input;
        input = sc.nextLine();
        StringBuilder sb = new StringBuilder(input);

        if (input.length() < 10) {
            System.out.println("Error: The string must have at least 10 characters.");
            return;
        }
        
        System.out.println();
        System.out.println("Original String: " + sb);

        int length = input.length();
        System.out.println("Length: " + sb.length());

        char firstChar = sb.charAt(0);
        System.out.println("First Character: " + firstChar);

        char lastChar = sb.charAt(sb.length() - 1);
        System.out.println("Last Character: " + lastChar);

        int firstOccur = sb.indexOf("a");
        System.out.println("Index of first occurrence of 'a': " + firstOccur);

        String substringFrom = sb.substring(3, 6);
        System.out.println("Substring from index 3 to 6: " + substringFrom);

        sb.append("123");
        System.out.println("After Append: " + sb);

        sb.insert(4, "xyz");
        System.out.println("After Insert xyz: " + sb);

        sb.delete(2, 4);
        System.out.println("After Delete index of 2 from 4: " + sb);

        sb.deleteCharAt(8);
        System.out.println("After Delete index of 8: " + sb);

        sb.reverse();
        System.out.println("After Reverse: " + sb);

    


    }
}