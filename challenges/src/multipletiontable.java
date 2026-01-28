import java.util.Scanner;
public interface multipletiontable {
    public static void main() {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number ");
        int num= input.nextInt();
        print(num);

    }

        public static void print(int num){
           int i=1;
            while(i<=10){
                int res=num*i;
                System.out.println(num+"*"+i+"="+res);
                i++;
            }
        }

}
