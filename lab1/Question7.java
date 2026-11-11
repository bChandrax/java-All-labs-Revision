package lab1;

import java.util.*;
public class Question7 {
    public static void main(){
        Scanner console = new Scanner(System.in);
        System.out.print("Write the temperature in degrees: ");
        float deg = console.nextFloat();

        float faren = deg * (float)(9/5) + 32;

        System.out.println("That is " + faren + " degrees farenheight");

        console.close();
    }
}
