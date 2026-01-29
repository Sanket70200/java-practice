import java.util.Scanner;
public class sumoddnumber {
    public static void main(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number ");
        int num= input.nextInt();
        int sum=print(num);
        System.out.print("sum of odd number is "+sum);
    }

    public static int print(int num){
      int i=1;
      int sum=0;
      while(i<=num){
          sum=sum+i;
          i+=2;
      }
      return sum;
    }
}
