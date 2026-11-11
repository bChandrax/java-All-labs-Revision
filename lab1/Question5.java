package lab1;

import java.util.*;
public class Question5 {
    public static void main(){
        int numOne, numTwo;
        Scanner console = new Scanner (System.in);

        System.out.print("Enter a number : ");
        numOne = console.nextInt();

        System.out.print("Enter another number : ");
        numTwo = console.nextInt();

        System.out.println("SUM: " + (numOne+numTwo));
        System.out.println("Difference: " + (numOne-numTwo));
        System.out.println("Product: " + (numOne*numTwo));
        System.out.println("Quotient: " + (numOne/numTwo));
        System.out.println("remainder: " + (numOne%numTwo));

        console.close();

    }    
}
