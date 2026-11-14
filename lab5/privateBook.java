package lab5;

public class privateBook{
    private Double price;
    private String author, title;

    privateBook(){
        this.price=0.00;
        this.author="Undefined";
        this.title="Undefined";
    }

    privateBook(String author, String title, Double price){
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

    public Double getPrice(){
        return this.price;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public void setAuthor(String author){
        this.author = author;
    }
}