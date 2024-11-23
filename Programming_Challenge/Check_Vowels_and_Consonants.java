import java.util.Scanner;

public class Check_Vowels_and_Consonants {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String input;
        System.out.print("Enter your string to check if vowels or consonants : ");
        input = sc.nextLine();
        System.out.println();

        String[] letters = input.trim().split("");
        String[] vowels = {"A","E","I","O","U"};

        for (String letter : letters) {

            for (String vowel : vowels) {
                if (vowel.equalsIgnoreCase(letter)) {
                    System.out.println(letter + " is a Vowel");
                    break; 
                }else if(letter.matches("[a-zA-Z]")){
                    System.out.println(letter + " is a Consonant");
                    break;
                } else{
                    System.out.println(letter + " is Invalid String");
                    break;
                }
            }
        }

            }
        }

    

