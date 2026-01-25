import java.util.Scanner;
class user {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter your name ");
        String name= input.nextLine();
        System.out.println("Good morning " + name);
        System.out.print(name + " Also tell me your age ");
        int age=input.nextInt();
        System.out.println("your age is " + age);
    }
}
