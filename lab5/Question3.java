package lab5;

public class Question3 {
    public static void main(){
        Book b1 = new Book("Karabo Machanja", "How I got better at small talk", 0.00);
        Book b2 = new Book("TheZimbabweanKarabo","Growing up away from home",3.99);

        b1.writeOut();
        b2.writeOut();
    }
}
