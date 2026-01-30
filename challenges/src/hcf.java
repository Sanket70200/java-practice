import java.util.Scanner;

public class hcf {
    public static void main(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a first number ");
        int first= input.nextInt();
        System.out.println("Enter a second number ");
        int second= input.nextInt();
        int hcf=hcf(first,second);
        System.out.print("HCF of number is "+hcf);


    }
    public static int hcf(int num1,int num2){
        int hcf=1;
        int i=2;
        int least=least(num1,num2);
        while(i<=least){
            if(num1%i==0 && num2%i==0){
                hcf=i;
            }
            i++;
        }
        return hcf;
    }

    public static int least(int num1,int num2){
        if(num1<num2){
            return num1;
        }else{
            return num2;
        }

    }

}
