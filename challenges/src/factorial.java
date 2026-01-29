import java.util.Scanner;
public class factorial {
    public static void main(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number ");
        int num= input.nextInt();
        long res=caluate(num);
        System.out.print("Factorial of number is "+res);
    }
    public static int caluate(long num){
        int fact=1;

        int i=2;

        if(num<2){
            return 1;
        }
        while(i<=num){
            fact=fact*i;
            i++;
        }
        return fact;


    }
}
