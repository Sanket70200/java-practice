import java.util.Scanner;

public class bitiwiseevenodd {
    public static void main(){

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= input.nextInt();
      if((num & 1)==1){
        System.out.println("Number is odd ");
    }else {
          System.out.println("Number is even");
      }
    }
}
