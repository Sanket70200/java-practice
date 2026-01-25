import java.util.Scanner;

class swap {
    public static void main() {
//        int a = 5;
//        int b = 10;
//        int temp;
//        System.out.println("Before swap a = "+a + " b= " +b);
//        temp=a;
//        a=b;
//        System.out.println("After swap a = "+a + " b= " +temp);

        Scanner input=new Scanner(System.in);
        System.out.print("Enter first number ");
        int a= input.nextInt();
        System.out.print("Enter a second no ");
        int b= input.nextInt();
        System.out.println("Before swapping");
        System.out.println("a= "+a + " b= "+b);

        int temp=a;
        a=b;
        System.out.println("After swapping");
        System.out.print("a= "+b + " b= "+temp);
    }
}