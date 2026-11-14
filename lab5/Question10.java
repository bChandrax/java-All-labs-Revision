package lab5;

public class Question10 {
    public static void main(){
        Library Biulms = new Library();
        privateBook[] books = {
            new privateBook("TheZimbabweanKarabo","Growing up away from home",3.99),
            new privateBook("Karabo Machanja", "How I got better at small talk", 0.00),
            new privateBook("Durand Jones & the indicators", "Sea gets Hotter", 3.17),
            new privateBook("WYS", "Jukebox", 2.28)
        };

        Biulms.addBook(books[0]);
        Biulms.addBook(books[1]);
        Biulms.addBook(books[2]);
        Biulms.addBook(books[3]);

        Biulms.printAllBooks();
    }
}
