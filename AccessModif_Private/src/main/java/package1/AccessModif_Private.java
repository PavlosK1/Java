package package1;
import package2.*;

public class AccessModif_Private {

    public static void main(String[] args) {
        // PRIVATE: visible only in the same class
        
        C item = new C();
        System.out.println(item.number);
    }
}
