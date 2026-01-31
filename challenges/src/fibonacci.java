import java.util.Scanner;
public class fibonacci {
    public static void main(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = input.nextInt();
        System.out.print("Fibonacii is ");
        printfibonacci(num);
    }
    public static void printfibonacci(int num){
        if(num<0) return;
        System.out.print("0 ");
        if(num==0)return;
        System.out.print("1 ");

        int first=0, second =1;
        while(first+second <= num){
            int third=first+second;
            System.out.print(third + " ");
            first=second;
            second=third;
        }
    }
}
