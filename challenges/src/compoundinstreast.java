import java.util.Scanner;

public class compoundinstreast {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter number of years: ");
        double year = input.nextDouble();

        System.out.print("Enter rate: ");
        double rate = input.nextDouble();

        double amount = principal * Math.pow((1 + rate / 100), year);

        System.out.println("Compound interest amount is " + amount);

        input.close();
    }
}
