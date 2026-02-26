class Laptop{
    private Laptop(){

    }
}class StaticFactory extends Laptop { //can't inherite class
    public static void main(String[] args) {
        StaticFactory obj = new StaticFactory();
        Laptop ob= new Laptop();
        //can't create object from other class/
    }   
}
