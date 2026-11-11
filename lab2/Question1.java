package lab2;

import java.util.*;
public class Question1{
    public static void main(){
        Scanner console = new Scanner (System.in);

        System.out.print("Enter your mark : ");
        double mark = console.nextDouble();

        console.close();

        if (mark>100 || mark<0){
            System.out.println("invalid");
        }else if(mark>80){
            System.out.println("A");
        }else if(mark>70){
            System.out.println("B");
        }else if(mark>60){
            System.out.println("C");
        }else if(mark>50){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }
    
}
