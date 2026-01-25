import java.util.Scanner;
public class percentage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a percentage: ");
        double num = input.nextDouble();

        if (num >= 90) {
            System.out.println("A grade");
        } else if (num >= 75) {
            System.out.println("B grade");
        } else if (num >= 60) {
            System.out.println("C grade");
        } else if (num >= 30) {
            System.out.println("D grade");
        } else {
            System.out.println("Fail...");
        }


    }
}