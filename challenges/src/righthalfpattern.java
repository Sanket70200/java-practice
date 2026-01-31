import java.util.Scanner;
public class righthalfpattern {
    public static void main() {
        Scanner input = new Scanner(System.in);
        int rows=0;
        while(rows<=5){
            System.out.print("*");
            int i=0;
            while(i<rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
}
