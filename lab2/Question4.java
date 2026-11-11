package lab2;

/*Question 4
 
— Writing Results to a File
 
[4 marks]

Write a program called Question4.java that asks the user, in a loop, for five students' names and scores, then writes all five

records to a new file named results.txt, one student per line.

●
 
Write each name and score to the file in the format Name,Score */

import java.util.*;
import java.io.*;

public class Question4 {
    public static void main(String[] args)throws Exception{
        String filename = "lab2/files/results.txt";
        Scanner console = new Scanner (System.in);
        FileWriter fw = new FileWriter(filename);

        for (int i=1;i<=5;i++){
            System.out.print("Enter student " + i + "'s name : ");
            String name = console.nextLine();

            System.out.print("Enter Student " + i + "'s mark : ");
            int mark = console.nextInt();
            console.nextLine();

            fw.write(name + "," + mark + System.lineSeparator());
        }

        fw.close();
        console.close();
    }
}
