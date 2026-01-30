import java.util.Scanner;
public class primenumber {
    public static void main(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number ");
        int num1= input.nextInt();
        boolean res=prime(num1);
        if(res){
            System.out.print("Number is prime ");
        }else {
            System.out.print("Number is not prime ");
        }

    }

    public static boolean prime(int num1){
        int i=2;
        while(i<num1) {
            if (num1 % i == 0) {
                return false;
            }
            i++;
        }
return true;
    }
}
