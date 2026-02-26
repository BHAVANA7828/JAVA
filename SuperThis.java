class A {
    A() {
        System.out.println("A");
    }
}
class B extends A {
    B() {
        this(10);
    }
    B(int i) {
        System.out.println("B");
    }
}
public class SuperThis {
    public static void main(String[] args) {
        B ob=new B();
    }
}