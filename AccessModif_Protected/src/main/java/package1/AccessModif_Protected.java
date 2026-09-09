package package1;
import package2.*;

public class AccessModif_Protected extends Sub{

    public static void main(String[] args) {
        
        // PROTECTED: visible to all classes in the same package or
        // classes in the other packages that are a subclass
        
        Sub item = new Sub();
            
        System.out.println(item.number);
    }
}
