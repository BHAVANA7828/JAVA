class Parent{
    String name="Parent";
}
class Child extends Parent{
    String name="Child";
    void display(){
        System.out.println(name);  //child
        System.out.println(this.name);  //child
        System.out.println(super.name);  //parent
    }

}
public class Shadowed {
    public static void main(String[] args) {
        Child c=new Child();
        c.display();
    }
    
}
