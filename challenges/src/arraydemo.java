import java.util.Scanner;

public class arraydemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] myarr = {12, 9, 8, 93, 200};
        int index = 0;

        while (index < myarr.length) {
            System.out.print(myarr[index] + " ");
            index++;
        }
    }
}
