package lab2;

import java.util.*;
import java.io.*;
public class Question7 {
    public static void main()throws Exception{
        String fileFrom, fileTo;
        fileFrom = "lab2/files/numbers.txt";
        fileTo = "lab2/files/stats.txt";

        Scanner console = new Scanner (new FileReader(fileFrom));
        FileWriter fw = new FileWriter(fileTo);
        
        int largest, smallest, current, sum, count;
        current = console.nextInt();
        largest = current;
        smallest = current;
        sum = 0;
        count = 1;
        sum += current;

        while (console.hasNext()){
            current = console.nextInt();
            
            if (current>largest){
                largest = current;
            }

            if (current<smallest){
                smallest =  current;
            }

            sum += current;
            count++;
        }

        double average = (double)sum/count;

        fw.write("Largest : " + largest + "\nSmallest : " + smallest + "\nAverage : " + average);

        console.close();
        fw.close();
    }
}
