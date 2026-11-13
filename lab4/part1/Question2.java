package lab4.part1;

import java.io.*;
public class Question2 {
    public static void main()throws Exception{
        String fileTo = "lab4/part1/files/output.txt";
        FileWriter fw = new FileWriter(fileTo);

        int[][] randoms = {
            {1,2,3,4,5,7},{23,54,65,1648,986,4}
        };

        for (int i=0; i<2;i++){
            for (int k=0; k<6; k++){
                fw.write(randoms[i][k] + "\n");
            }
        }

        fw.close();
    }
}
