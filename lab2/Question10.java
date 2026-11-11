package lab2;

import java.util.*;
import java.io.*;

public class Question10 {
    public static void main()throws Exception{
        String fileFrom;
        fileFrom = "lab2/files/numbers.txt";

        Scanner fileConsole = new Scanner(new FileReader(fileFrom));
        Scanner userConsole =  new Scanner(System.in);

        System.out.print("Enter a number to search for : ");
        int num = userConsole.nextInt();
        boolean found = false;

        int current;
        while (fileConsole.hasNext()) {
            current = Integer.parseInt(fileConsole.nextLine());

            if (current == num){
                System.out.println(num + " exists in numbers.txt");
                found=true;
                break;
            }
        }

        if (found!=true){
            System.out.println(num + " does not exist in numbers.txt");
        }

        fileConsole.close();
        userConsole.close();

    }
}
