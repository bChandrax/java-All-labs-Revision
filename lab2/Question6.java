package lab2;

import java.util.*;
public class Question6 {
    public static void main(){
        Scanner console = new Scanner (System.in);

        System.out.print("Enter a number (1 to 7) : ");
        int number = console.nextInt();

        switch(number){
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid");
        }

        console.close();
    }
}
