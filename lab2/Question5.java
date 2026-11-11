package lab2;

import java.util.*;
import java.io.*;
public class Question5 {

    public static void main()throws Exception{
        String fileFrom = "lab2/files/results.txt";
        String fileTo = "lab2/files/grades.txt";

        Scanner console =  new Scanner(new FileReader(fileFrom));
        FileWriter fw = new FileWriter(fileTo);

        while (console.hasNext()){
            String line = console.nextLine();
            int indexOfComma = line.indexOf(",");
            String grade = new String();
            String name = line.substring(0,indexOfComma);

            int score = Integer.parseInt(line.substring(indexOfComma+1));

            if (score>100 || score<0){
                grade = "invalid";
            }else if(score>80){
                grade = "A";
            }else if(score>70){
                grade = "B";
            }else if(score>60){
                grade = "C";
            }else if(score>50){
                grade = "D";
            }else{
                grade = "F";
            }

            fw.write(name + "," + score+ "," + grade + "\n");
        }

        console.close();
        fw.close();
    }
}
