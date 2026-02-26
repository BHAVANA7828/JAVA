class A{
    int instanceVar=10;
    static void myMethod(){
        //instance can't access in static
        System.out.println(this.instanceVar);
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        StaticMethod ob= new StaticMethod();
    }
    
}
