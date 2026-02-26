public class ReverseLastWord {
    public static void main(String[] args) {
        String s = "Broken Laptop is given";
        int i = s.length() - 1;
        // find where the last word starts
        while (i >= 0 && s.charAt(i) != ' ') {
            i--;
        }
        String result = "";
        // copy the part before the last word
        for (int j = 0; j <= i; j++) {
            result = result + s.charAt(j);
        }
        // reverse the last word
        for (int j = s.length() - 1; j > i; j--) {
            result = result + s.charAt(j);
        }
        System.out.println(result);
    }
}



// import java.util.Scanner;
// public class ReverseLastWord {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = "Broken Laptop is given";
//         String str[] = s.split("");
//         for(int i=0;i<str.length-1;i++){
//             System.out.print(str[i]+" ");
//         }
//         for(int i = str[str.length-1].length()-1;i>=0;i--){
//             System.out.print(str[str.length-1].charAt(i));
//         }
        
//     }
// }
    
