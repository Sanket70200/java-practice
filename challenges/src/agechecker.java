import java.util.Scanner;
public class agechecker {

public static void main(){
    Scanner input= new Scanner(System.in);
    System.out.print("Enter a age ");
    int age= input.nextInt();
    if (age<=13){
        System.out.println("Child");
    } else if (age<=20) {
        System.out.println("Teen age");
        
    } else if (age<=60) {
        System.out.println("Adult");
        
    }else {
        System.out.println("Senior person age");
    }
}}
