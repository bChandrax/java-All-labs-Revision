package lab5;

public class Question6 {
    public static void main(){
        privateBook bks[] = {
            new privateBook("TheZimbabweanKarabo","Growing up away from home",3.99),
            new privateBook("Karabo Machanja", "How I got better at small talk", 0.00)
        };

        for (int i=0;i<2;i++){
            bks[i].getSummary();
        }
    }
    
}
