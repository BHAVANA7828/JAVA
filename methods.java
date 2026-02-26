import java.util.Arrays;
import java.util.Scanner;
public class methods {
    void print();
    void display{
        System.out.println("disp");
        return;
    }
    int play(){
        return 10;
    }
    double walk(int km){
        return km+10;
    }
    void speak(int time){
        System.out.println(time);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Basic ob = new Basic();
        ob.display();
    }
}
