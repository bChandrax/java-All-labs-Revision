package lab1;

import java.util.*;
public class Question3 {
    public static void main(){
        Scanner console = new Scanner (System.in);

        System.out.print("Enter your name : ");
        String name = console.nextLine();

        System.out.print("Enter your age : ");
        int age = console.nextInt();

        System.out.println("Hello " + name + "! In 5 years you will be " + (age + 5) + " years old.");

        console.close();
    }
}
