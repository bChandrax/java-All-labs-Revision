package lab3;

import java.util.*;
public class Question6 {
    public static void main(){
        Scanner console = new Scanner(System.in);
        int number,sum;
        sum = 0;

        do{
            System.out.print("\nEnter a number to add to the running total\n(current total is " + sum + ")\n[enter 0 to exit] : ");
            number = console.nextInt();
            sum+=number;
        }while(number!=0);
        console.close();
    }
}
