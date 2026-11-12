package lab3;

import java.util.*;
public class Question7 {
    public static void main(){
        System.out.print("Enter a number : ");
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();

        for(int i=1;i<=12;i++){
            System.out.println(i*number);
        }

        console.close();
    }
}
