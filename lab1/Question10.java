package lab1;

import java.util.*;
public class Question10 {

    public static void main(){
        Scanner console = new Scanner (System.in);

        System.out.print("Enter your full name : ");
        String name = console.nextLine();

        String fname, lname, initials;
        int indexOfSpace = name.indexOf(" ");

        fname = name.substring(0,indexOfSpace);
        lname = name.substring(indexOfSpace+1);
        
        System.out.println("FIRSTNAME: " + fname);
        System.out.println("SURNAME: " + lname);

        initials = fname.substring(0,1) + "." + lname.substring(0,1);
        System.out.println("INITIALS: " + initials);

        console.close();
    }
}
