import java.util.Scanner;
public class Heading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "dell laptop is broken";
        for(int i=0;i<s.length();i++){
            if(i==0 ||s.charAt(i-1)==' '){
                char c = (char)(s.charAt(i)-32);
            System.out.print(c);
            }
            else
                System.out.print(s.charAt(i));
        }
    }
} 

