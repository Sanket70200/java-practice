import java.util.Scanner;
public class leepyear {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year ");
        int num = input.nextInt();
        if((num%4==0 && num%100 !=0) || num%400==0 ){
System.out.println("Leep year");
        }else {
            System.out.println("non leep year");
        }
    }
}
