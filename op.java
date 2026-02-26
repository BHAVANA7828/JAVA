
import java.util.Scanner;

public class op{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int array[][] = new int[4][4];
        int new_arr[][]=new int[3][];
        new_arr[0]=new int[2];
        new_arr[1]=new int[6];
        new_arr[1]=new int[3];
        for(int i=0;i<new_arr.length;i++){
            for(int j =0; j<new_arr[i].length;j++){
                new_arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<new_arr.length;i++){
            for(int j =0; j<new_arr[i].length;j++){
                System.out.println(new_arr[i][j]+" ");
            }
        System.out.println();
    }
}
}





//         bye:
//         for(int i=0;i<5;i++){
//             for(int j=0;j<5;j++){
//                 if(i==1)
//                 continue bye;
//                 System.out.println(i);
//             }
//         }
// }
// }


        


//         for(System.out.println("1");i<5;System.out.println("+")){
//             System.out.println(i);
//             i++;
//         }

//     }

// }
//         Scanner sc= new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         sc.nextLine();
//         String str=sc.nextLine();
//         switch(str){
//             case "AND" :System.out.println(a&b);break;
//             case "XOR": System.out.println(a^b);break;
//             case "OR" : System.out.println(a|b);break;
//             case "NAND" : System.out.println(~(a&b));break;
//             default:System.out.println("Invalid input");
//         }
//     }
// }




    // int mobile=10000;
        // switch(mobile) {
        //     case 10000: System.out.println("10000");
        //     System.out.println("same");
        //     case 20000: System.out.println("20000");break;
        //     case 30000: System.out.println("30000");break;
        //     default:System.out.println("default");
            
        // }



        // int num1 = 20,num2 = 30;
        // System.out.println(num1++ > ++num1 && ++num1>num2++);
        // System.out.println(num1);
        // System.out.println(num2);


    


