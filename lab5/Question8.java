package lab5;

public class Question8 {
    public static String cheaperBook(privateBook b1, privateBook b2){
        if (b1.getPrice()<b2.getPrice()){
            return  "\n\'"+ b1.getTitle() + "\' is the cheaper book";
        }else if (b1.getPrice()>b2.getPrice()){
            return "\n\'"+ b2.getTitle() + "\' is the cheaper book" ;
        } else{
            return "They are the same price";
        }
    }

    public static void main(){
        privateBook bks[] = {
            new privateBook("TheZimbabweanKarabo","Growing up away from home",3.99),
            new privateBook("Karabo Machanja", "How I got better at small talk", 0.00)
        };

        System.out.println(cheaperBook(bks[0],bks[1]));
    }
}
