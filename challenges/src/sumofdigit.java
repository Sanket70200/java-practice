import java.util.Scanner;
public class sumofdigit {
    public static void main(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number ");
        int num= input.nextInt();
        int res=sumdigit(num);
        System.out.print("sum is "+ res);
    }

    public static int sumdigit(int num) {
        int sum = 0;

        while (num != 0) {  //another condition num>0
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;

    }
    }
