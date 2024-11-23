import java.util.Scanner;

public class Sting_Methods {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input;
        System.out.println();
        System.out.print("Input Random Strings : ");
        input = sc.nextLine();

        int length = input.length();
        String upperCase = input.toUpperCase();
        String lowerCase = input.toLowerCase();
        char firstLetter = input.charAt(0);
        char lastLetter = input.charAt(length - 1);
        String subString = (length >= 5 ? input.substring(2, 5): "Error - Your string is lessthan 5 😜");
        
        System.out.println();
        System.out.println("The Length is : " + length);
        System.out.println("The Converted toUpperCase : " + upperCase);
        System.out.println("The Converted toLowerCase : " + lowerCase);
        System.out.println("The First Letter is : " + firstLetter );
        System.out.println("The Last Letter is : " + lastLetter );
        System.out.println("The Substring from Second and Fifth Character is : " + subString);

        
    }
}
