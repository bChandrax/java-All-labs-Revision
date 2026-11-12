package lab3;

import java.util.*;
public class Question8 {
    public static boolean isVowel(char letter){
        if(
            (letter=='a')||(letter=='e')||(letter=='i')||(letter=='o')||(letter=='u')
        ){
            return true;
        }else{
            return false;
        }
    }

    public static void main(){
        Scanner console = new Scanner(System.in);
        int vowelCount = 0;

        System.out.print("Enter a sentence : ");
        String sentence = console.nextLine().toLowerCase();

        for(int i = 0; i<=(sentence.length()-1); i++){

            char letter = sentence.charAt(i);

            if(isVowel(letter)==true){
                vowelCount++;
            }
            
        }

        System.out.println("There are " + vowelCount + " vowels in this sentence.");

        console.close();
    }
}
