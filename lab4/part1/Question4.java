package lab4.part1;

import java.util.*;
public class Question4 {
    public static void main(){
        System.out.print("Enter a number to convert to binary : ");
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        String binaryAnwer = "";
        int pass;

        pass = number;
        while (pass!=0) {
            if (binaryAnwer.length()%5==0){
                binaryAnwer = String.valueOf(pass%2) + " " +  binaryAnwer;
            }else{
                binaryAnwer = String.valueOf(pass%2) + binaryAnwer;
            }
            pass = (int)pass/2;
        }

        System.out.println(number + " = " + binaryAnwer + "(binary)");
        console.close();

    }
}
