package lab1;

import java.util.*;
public class Question8{
    public static void main(){
        Scanner console = new Scanner (System.in);
        int len, wid;

        System.out.print("Enter the length : ");
        len = console.nextInt();

        System.out.print("Enter the width : ");
        wid = console.nextInt();

        System.out.println("AREA: " + (len*wid));
        System.out.println("PERIMETER: " + (2*len + 2*wid));

        console.close();
    }
}
