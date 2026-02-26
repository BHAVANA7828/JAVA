import java.util.Scanner;
public class withoutlength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s="dell";
        int count=0;
        for(char c:s.toCharArray()){
            count++;
    }
    System.out.println(count);
}
}
