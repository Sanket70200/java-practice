import java.util.Scanner;
public class returns {
public static void main(){
    greet();
    int first=readnumber();
    int second=readnumber();

    int res=first+second;
    System.out.println("Sum of number is "+res);

}


public static int readnumber(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number ");
    int number= input.nextInt();
    return number;
}
public static void greet(){
    System.out.println("Welcome all to learn return keyword");
}

}
