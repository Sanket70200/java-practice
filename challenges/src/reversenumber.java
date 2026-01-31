import java.util.Scanner;
public class reversenumber {
    public static void main(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number ");
        int num= input.nextInt();
        int reverse=reverse(num);
        System.out.print("Reverse number is "+reverse);
    }

    public static int reverse(int num){
        int newdigit=0;
        while(num>0){
            int digit=num%10;
            newdigit=newdigit*10+digit;
            num /=10;
        }
        return newdigit;
    }
}
