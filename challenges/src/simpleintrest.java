import java.util.Scanner;
public class simpleintrest {
    public static void main(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Amount and principle ");
        double pre = input.nextDouble();
        System.out.print("Enter a number of year ");
        double year = input.nextDouble();
        System.out.print("Enter a rate  ");
        double rate = input.nextDouble();

        double intrest= (pre*year*rate)/100;
        System.out.println("simple intrest  is "+intrest);
    }

}
