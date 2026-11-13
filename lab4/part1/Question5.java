package lab4.part1;

import java.util.*;
public class Question5 {
    public static void main(){
        System.out.print("\nThis is a palindrone check. Enter a word : ");
        Scanner console = new Scanner(System.in);
        String sentence = console.nextLine();
        boolean isPalindrome = true;
        int leftIndex = 0;
        int rightIndex = sentence.length()-1;

        while (leftIndex<rightIndex){
            if(
                sentence.charAt(leftIndex)!=sentence.charAt(rightIndex)
            ){
                isPalindrome=false;
                break;
            }
            leftIndex++;
            rightIndex--;
        }

        if (isPalindrome){
            System.out.println(sentence + " is a palindrome");
        }else{
            System.out.println(sentence + " is not a palindrome");
        }

        console.close();
    }
}
