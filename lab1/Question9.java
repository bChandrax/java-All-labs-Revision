package lab1;

import java.util.*;
public class Question9 {
    
    public static void main(){
        Scanner console = new Scanner (System.in);

        System.out.print("Enter a sentance : ");
        String sentence = console.nextLine();

        System.out.println("LENGTH: " + sentence.length());
        System.out.println("VARIANT 1: " + sentence.toUpperCase());
        System.out.println("VARIANT 2: " + sentence.toLowerCase());
        System.out.println("CONTAINS \"JAVA\": " + sentence.toLowerCase().contains("java"));


        console.close();
    }
    

}
