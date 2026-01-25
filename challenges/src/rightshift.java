import java.util.Scanner;

public class rightshift {

    public static void main(){

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int num1= input.nextInt();
        int res= num1>>1;
        System.out.println("ressult is "+res);
    }
}
