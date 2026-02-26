public class Finalinstance {
    final int ID;
    Finalinstance(){
        ID = 10;
    }                                           
    public static void main(String[] args) {
        Finalinstance f = new Finalinstance();
        System.out.println(f.ID);
        //f.ID = 20;//Exception final int id cannot be use again
    }
}