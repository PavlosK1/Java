package package2;
import package1.*;

public class Sub {
    
    public static void main(String[] args) {
        // PUBLIC: visible in all classes in all packages
        
        C item = new C();
        System.out.println(item.number);
    }
    
}
