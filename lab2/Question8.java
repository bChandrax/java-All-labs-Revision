package lab2;

import java.util.*;
import java.io.*;
public class Question8 {
    public static void main(String[] args)throws Exception{
        String fileTo, fileFrom;
        fileFrom = "lab2/files/numbers.txt";
        fileTo = "lab2/files/evenodd.txt";

        Scanner console = new Scanner(new FileReader(fileFrom));
        FileWriter fw = new FileWriter(fileTo);

        int even, odd, current;
        even = 0;
        odd = 0;

        while(console.hasNext()){
            current = console.nextInt();
            if (current%2==0){
                even++;
            }else{
                odd++;
            }
        }

        fw.write("There are "+ even + " even numbers.\nThere are " + odd + " odd numbers.");
        fw.close();
        console.close();

    }
}
