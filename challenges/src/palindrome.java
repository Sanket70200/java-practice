import java.util.Scanner;
public class palindrome {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = input.nextInt();
        boolean ispalindrome = ispalindrome(num);
        if (ispalindrome) {
            System.out.print("Number is palindrome");

        } else {
            System.out.print("Number is not palindrome");
        }

    }

        public static boolean ispalindrome(int num){
            return num == reverse(num);
        }

        public static int reverse(int num){
int newnum=0;
while(num>0){
int digit=num%10;
newnum=newnum*10+digit;
num/=10;

}
return newnum;
        }


}
