package lab2;

import java.util.*;
import java.io.*;

public class Question3 {
    public static void main()throws Exception{
        String filename = "lab2/files/students.txt";
        Scanner console = new Scanner (new FileReader(filename));

        while (console.hasNext()){
            String line = console.nextLine();
            int indexOfComma = line.indexOf(",");
            System.out.println("=======================================");
            System.out.println("NAME: " + line.substring(0,indexOfComma));
            System.out.println("MARK: " + line.substring(indexOfComma+1));
        }

        console.close();
    }
}
