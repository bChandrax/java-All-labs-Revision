package lab2;

import java.util.*;
import java.io.*;
public class Question9 {
    public static void main(String[] args)throws Exception{
        String fileTo, fileFrom;
        fileFrom = "lab2/files/numbers.txt";
        fileTo = "lab2/files/sign.txt";

        Scanner console = new Scanner(new FileReader(fileFrom));
        FileWriter fw = new FileWriter(fileTo);

        int negative, positive, current;
        negative = 0;
        positive = 0;

        while(console.hasNext()){
            current = console.nextInt();
            if (current>0){
                positive++;
            }else{
                negative++;
            }
        }

        fw.write("There are "+ positive + " positive numbers.\nThere are " + negative + " negative numbers.");
        fw.close();
        console.close();

    }
}
