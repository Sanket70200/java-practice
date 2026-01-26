import java.util.Scanner;

public class pattern1 {
public static void main(){
    int rows=0;
    while(rows<5)
    {
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
