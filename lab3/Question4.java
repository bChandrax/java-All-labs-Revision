package lab3;

import java.util.*;
public class Question4 {
    public static void main(){
        int answer;
        Scanner console = new Scanner(System.in);
        do{
            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Enter the number option you want: ");
            System.out.println("1. Continue");
            System.out.println("2. Exit");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
            answer = console.nextInt();
        }while(answer!=2);

        console.close();
    }
}
