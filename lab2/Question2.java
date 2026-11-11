package lab2;

import java.util.*;
public class Question2 {
    public static void main(){
        Scanner console = new Scanner(System.in);
        
        System.out.print("Enter your full name: ");
        String name = console.nextLine();

        System.out.print("What letter should we look for? : ");
        String letter = console.next().toLowerCase();

        console.close();

        System.out.println("VARIANT 1 : " + name.toUpperCase());
        System.out.println("VARIANT 2 : " + name.toLowerCase());
        System.out.println("LETTER FOUND? :  " + name.toLowerCase().contains(letter));
    }
}
