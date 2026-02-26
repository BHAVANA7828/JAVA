import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1="anagram";
        String s2="nagarma";
        boolean flag= false;
        int arr[] = new int [26];
        if(s1.length()!=s2.length()){
            flag = false;
        }
        if(flag){
            for(int i=0;i<s1.length();i++){
                arr[s1.charAt(i)-97]+=1;
                System.out.println(arr[s1.charAt(i)-97]);
        }
        System.out.println();
        for(int i=0;i<s2.length();i++){
            arr[s2.charAt(i)-97]-=1;
            System.out.println(arr[s2.charAt(i)-97]);
            if(arr[s2.charAt(i)-97]<0){
                flag=false;
                break;
            }
        }
        }
    }
    
}
