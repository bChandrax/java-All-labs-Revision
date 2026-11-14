package lab5;

public class Book{
    Double price;
    String author, title;

    Book(){
        this.price=0.00;
        this.author="Undefined";
        this.title="Undefined";
    }

    Book(String author, String title, Double price){
        this.price=price;
        this.author=author;
        this.title=title;
    }

    public void writeOut(){
        System.out.println("\nTITLE: "+ title);
        System.out.println("AUTHOR: "+ author);
        System.out.println("PRICE: "+ price+"\n");
    }

    public void getSummary(){
        System.out.println("\n\""+title+"\" written by "+ author + " costs " + price + ".\n");
    }
}