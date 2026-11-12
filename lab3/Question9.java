package lab3;

import java.util.*;
public class Question9 {
    
    public static void main(){
        Scanner console = new Scanner(System.in);
        
        System.out.print("Enter a number to find the factorial of : ");
        int number = console.nextInt();
        int factorial=1;

        for(int i=1;i<=number;i++){
            factorial*=number;
        }

        System.out.println( number + "!= " + factorial);

        console.close();
    }
}
