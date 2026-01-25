import java.util.Scanner;
public class oddeven {
    public static void main(){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number ");
        int num= input.nextInt();
        if(num%2==0){
            System.out.println("Number is even");
        }else {
            System.out.println("Number is odd");
        }
    }
}
