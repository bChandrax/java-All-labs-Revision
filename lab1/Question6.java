package lab1;

import java.util.*;
public class Question6 {
    public static void main(){
        Scanner console = new Scanner (System.in);

        System.out.print("Enter 3 scores : ");
        int scoreOne = console.nextInt();
        int scoreTwo = console.nextInt();
        int scoreThree = console.nextInt();

        System.out.println("Average : " + ( (float)(scoreOne+scoreTwo+scoreThree)/3 ) );

        console.close();
    }
}
