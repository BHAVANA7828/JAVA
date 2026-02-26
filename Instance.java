class X{

}
class Y extends X{

}
public class Instance {
    public static void main(String args[]){
        X ob =new Y();
        Y obj=(Y)ob;
        System.out.println(ob instanceof X);
        System.out.println(ob instanceof Y);

    }
}