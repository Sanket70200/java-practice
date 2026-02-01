import java.util.Scanner;
public class righthalfpattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int row = input.nextInt();

        printRightHalfPattern(row);
        printLeftHalfPattern(row);//reverse
        printtLeftHalfPattern(row);

        input.close();
    }
    public static void printtLeftHalfPattern(int maxRows) {
        System.out.println("\nRight side half pyramid pattern");

        int rows = 1;

        while (rows <= maxRows) {

            // print spaces
            int space = 0;
            while (space < (maxRows - rows)) {
                System.out.print("  "); // two spaces for alignment
                space++;
            }

            // print stars
            int star = 0;
            while (star < rows) {
                System.out.print("* ");
                star++;
            }

            System.out.println();
            rows++;
        }
    }


    public static void printLeftHalfPattern(int maxRow) {
        System.out.println("\nLeft half pyramid pattern");
        int rows = maxRow;

        while (rows > 0) {
            int i = 0;
            while (i < rows) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }

    public static void printRightHalfPattern(int maxRow) {
        System.out.println("\nRight half pyramid pattern reverse");
        int rows = 0;

        while (rows < maxRow) {
            int i = 0;
            while (i <= rows) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
}
