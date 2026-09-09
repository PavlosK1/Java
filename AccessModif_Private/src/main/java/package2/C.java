package package2;

public class C {
    public int number;
    
    
    // Main and Sub Error
    private C() {
        super();
        
    }
}
        
///This way we can create the object but we do NOT have access to "int number"
///only in here (class C) we have access
    
    ///private int number;
        
    ///public C() {
    ///    super();

