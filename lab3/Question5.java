package lab3;

import java.util.*;
public class Question5 {
    public static void main(){
        int number;
        Scanner console = new Scanner (System.in);

        do{
            System.out.print("\nEnter a number between (1-10) : ");
            number = console.nextInt();
        }while((number>10)||(number<0));

        console.close();
    }
}
