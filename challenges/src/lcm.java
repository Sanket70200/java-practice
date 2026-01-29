import java.util.Scanner;
public class lcm {
    public static void main(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a first number ");
        int first= input.nextInt();
        System.out.print("Enter a second number ");
        int second= input.nextInt();
        int lcm=lcm(first,second);
        System.out.println("Lcm of number is "+lcm);
    }
    public static int lcm(int first,int second){
        int i=1;
        while(true){
            int factor= first*i;
            if(factor%second==0){
                return factor;
            }
            i++;
        }
    }
}
