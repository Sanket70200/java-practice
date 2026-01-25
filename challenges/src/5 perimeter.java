import java.util.Scanner;

class perimeter {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a side 1 ");
        double s1=input.nextDouble();
        System.out.println("Enter a side 2 ");
        double s2=input.nextDouble();
        System.out.println("Enter a side 3 ");
        double s3=input.nextDouble();
        System.out.println("Enter a side 4 ");
        double s4=input.nextDouble();
double peri=s1+s2+s3+s4;
        System.out.println("perimeter of rectangle is "+peri +" cm");

    }
}