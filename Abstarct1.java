abstract class Laptop1{
    void display(){
        System.out.println("abs");
    }
    abstract void print();
}
class Abstarct1 extends Laptop1{
    void print(){
        System.out.println("Abstarct");
    }
    public static void main(String[] args) {
        Abstarct1 ob = new Abstarct1();
        ob.print();
        ob.display();
    }
}
