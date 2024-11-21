package Programming_Challenge;

import java.util.Scanner;

public class Score_to_Grade_A_to_F {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int grade;
        System.out.print("Enter Your Score : ");
        grade = sc.nextInt();

        if (grade >= 90){
            System.out.println("Your grade is A");
        }else if(grade >= 80 || grade >= 89){
            System.out.println("Your grade is B");
        }else if(grade >= 70 || grade >= 79){
            System.out.println("Your grade is C");
        }else if(grade >= 60 || grade >= 69){
            System.out.println("Your grade is D");
        }else {
            System.out.println("Your grade is F");
        }

    }
}