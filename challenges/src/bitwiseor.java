import java.util.Scanner;
public class bitwiseor {
    public static void main(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a first number");
        int num1= input.nextInt();
        System.out.println("Enter a second number");
        int num2= input.nextInt();

        int res= num1 | num2;
        System.out.println("ressult is "+res);
    }
}
