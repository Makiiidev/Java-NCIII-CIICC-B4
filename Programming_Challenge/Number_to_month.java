import java.util.Scanner;

public class Number_to_month {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Month Number (1 to 12) : ");
        int month = sc.nextInt();

        // Janurary, March, May, July, August, October and December has 31 days.
        // April, June, September and Novermeber has 30 days.
        // Feburary is the only one has 28 days every year.

        switch (month) {

            // case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            //     System.out.println("31 days");
            //     break;
            // case 4: case 6: case 9: case 11:
            //     System.out.println("30 days");
            //     break;
            // case 2:
            //     System.out.println("28 days");
            //     break;

            case 1:
                System.out.println("January has 31 days");
                break;
            case 2:
                System.out.println("Feburary has 28 days");
                break;
            case 3:
                System.out.println("March has 31 days");
                break;
            case 4:
                System.out.println("April has 30 days");
                break;
            case 5:
                System.out.println("May has 31 days");
                break;
            case 6:
                System.out.println("June has 30 days");
                break;
            case 7:
                System.out.println("July has 31 days");
                break;
            case 8:
                System.out.println("August has 31 days");
                break;
                case 9:
                System.out.println("September has 30 days");
                break;
            case 10:
                System.out.println("October has 31 days");
                break;
            case 11:
                System.out.println("Novermber has 30 days");
                break;
            case 12:
                System.out.println("December has 31 days");
                break;
            default:
                System.out.println("Invalid Month Number");
        }


    }
}
