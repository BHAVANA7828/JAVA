import java.util.Scanner;
public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter score:");
        int score=sc.nextInt();
        char grade = (score>=90)?'A': (score>=80)?'B': (score>=70)?'C': (score>=60)? 'D':'F';
        System.out.println(grade);
    }
    
}
