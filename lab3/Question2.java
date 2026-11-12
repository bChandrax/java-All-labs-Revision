package lab3;

import java.util.*;
public class Question2 {
    public static void main(){

        Scanner console = new Scanner(System.in);

        System.out.print("Enter a number to sum to : ");
        int numTo = console.nextInt();
        int count = 1;
        int sum = 0;

        while(count<numTo){
            sum+=count;
            count++;
        }

        System.out.println(sum);

        console.close();
    }
}
