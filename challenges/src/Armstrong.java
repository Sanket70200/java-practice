import java.util.Scanner;
public class Armstrong {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if (isArmstrong) {
            System.out.print("Armstrong number ");
        } else {
            System.out.print("Not Armstrong number ");
        }
    }
        public static boolean isArmstrong(int num){
            int noofDigit= noofDigit(num);
            int numcopy=num;
            int finalnumber=0;
            while(num>0){
                int lastdigit=num % 10;
                num/=10;
                finalnumber+=  pow(lastdigit,noofDigit);
            }
            return finalnumber == numcopy;
        }

        public static int pow(int num1,int num2){
            int result=1;
            int i=0;
            while(i<num2){
                result*=num1;
                i++;
            }
            return result;
        }

        public static int noofDigit(int num){
            int digit=0;
            while(num>0){
                digit++;
                num/=10;

            }
            return digit;

    }
}
