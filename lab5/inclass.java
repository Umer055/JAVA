import java.util.Scanner;
public class inclass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int count = 0 , sum = 0, num = 0;
        // // while (count < 10){
        //     // System.out.println("Enter the number of values");
        //     // num = input.nextInt();
        //     // sum = sum + num;
        //     // count++;
        //     // }
        //     for (int i = 0;i < 10;i++){
        //     System.out.println("Enter the number of values");
        //     num = input.nextInt();
        //     sum = sum+num;
        
        // }
        // System.out.println("The sum is"+sum);
            


// `        System.out.println("Enter the number you want to take the base");
//         int num = input.nextInt();
//         System.out.println("Enter the power of base");
//         int pow = input.nextInt();
//         int count = 1;
//         int product = 1;
//         while (count < pow ){
//             product = product * pow;
//             count++;
            
//     }
//     System.out.println("The power is "+product);

// int previous = 0, next = 1, f = 1;
// System.out.println(previous+" "+next+" ");
// System.out.println("Enter the n");
// int n = input.nextInt();
// while (f != n){
//     f = previous + next;
//     previous = next;
//     next = f;
//     System.out.println(f);
// }

for (int i = 5; i >0 ; i-- ){
    for(int j = 1; j <6; j++){
        if (j < i) {
            System.out.print(" ");
        } 
        else {
        System.out.print("*");
        }
    }
    System.out.println();
}






}

}
