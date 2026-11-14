package lab5;

import java.util.ArrayList;

public class Library {
    ArrayList<privateBook> Lib = new ArrayList<>();

    Library(){}

    public void addBook(privateBook b){Lib.add(b);}
    
    public void printAllBooks(){
        for (privateBook b : Lib){
            b.writeOut();
        }
    }

}
