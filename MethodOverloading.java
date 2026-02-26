class A{
    void speak(int i){
        System.out.println("Overloading");
    }
    void speak(double d){
        System.out.println("Overriding");
    }
}
class B extends A{
    @Override
    void speak(int i){
        System.out.println("Overriding");
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        A obj = new A();   //upcasting
        B ob= new B();    //downcasting
        ob.speak(10);
    }
    
}
