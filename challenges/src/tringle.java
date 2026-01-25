import java.util.Scanner;


public class tringle {

public static void main(){

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a height ");
    double hei = input.nextDouble();
    System.out.print("Enter a Base ");
    double base = input.nextDouble();

    double area= (base*hei)/2;
    System.out.println("Area of triangle is "+area);
}
}
