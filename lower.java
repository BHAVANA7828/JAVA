import java.util.Scanner;
public class lower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s ="Dell";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)<='Z')  // upper to lowerCase
            System.out.print((char)(s.charAt(i)+32));
        else if(s.charAt(i)>'Z')  //lower to upperCase
            System.out.print((char)(s.charAt(i)-32));
    }
        }
    }

    
