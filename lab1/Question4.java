package lab1;

import java.util.*;
public class Question4 {
    
    public static void main(){

        Scanner console = new Scanner (System.in);

        System.out.print("Enter a whole number : ");
        int num = console.nextInt();

        System.out.print("Enter a decimal number : ");
        double numTwo = console.nextDouble();

        System.out.print("Enter a single word : ");
        String word = console.next();


        System.out.println("You entered " + num + ", " + numTwo + ", and the word \"" + word + "\"");

        console.close();
    }

}
