package TaskSheets;

import java.util.Scanner;

public class Task_119 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("4 Basic arithmetic operations using methods");
    System.out.println();
    System.out.print("ENTER FIRST NUMBER : ");
    int firstNum = sc.nextInt();
    System.out.print("ENTER FIRST NUMBER : ");
    int secondNum = sc.nextInt();

    System.out.println("Sum        : " + addition(firstNum,secondNum));
    System.out.println("Difference : " + subtraction(firstNum,secondNum));
    System.out.println("Product    : " + division(firstNum,secondNum));
    System.out.println("Quotient   : " + multiplication(firstNum,secondNum));

    }

    static int addition(int num1, int num2){
        int result = num1 + num2;
        return result;
    }

    static int subtraction(int num1, int num2){
        int result = num1 - num2;
        return result;
    }

    static float division(float num1, float num2){
        float result = num1 / num2;
        return result;
    }

    static int multiplication (int num1, int num2){
        int result = num1 * num2;
        return result;
    }


}