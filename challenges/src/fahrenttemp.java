import java.util.Scanner;

public class fahrenttemp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your temp in F ");
        double fah = input.nextDouble();


        double cel = (fah-32)*5/9;

        System.out.println("your temperture is " + cel);

        input.close();
    }
}
