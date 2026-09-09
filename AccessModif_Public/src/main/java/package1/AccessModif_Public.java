package package1;
import package2.*;

public class AccessModif_Public {

    public static void main(String[] args) {
        // PUBLIC: visible in all classes in all packages
        
        C item = new C();
        System.out.println(item.number);
    }
}
