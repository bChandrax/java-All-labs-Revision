package lab4.part1;

import java.util.*;
import java.io.*;

public class Question1 {
    public static void main()throws Exception{
        String fileFrom = "lab4/part1/files/names.txt";
        int count = 0;
        String[] names = new String[20];
        Scanner console = new Scanner(new FileReader(fileFrom));

        while (
            (console.hasNext()) && (count<=20)
        ){
            names[count] = console.nextLine();
            count++;
        }

        for(int i = 0; i<20;i++){
            if(names[i]!=null){System.out.println(i + ". " +names[i]);}
            else{System.out.println(i + ". Empty");}
        }

        console.close();
    }    
}
