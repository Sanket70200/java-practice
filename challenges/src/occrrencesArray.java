import java.util.Scanner;
public class occrrencesArray {
    public static void main(String[] args){
        Scanner input= new Scanner (System.in);
        int[] numArr=ArrayUtility.inputArray();
        System.out.println("Now enter a number you want to find ");
        int num = input.nextInt();
        int occurrences=noofoccerences(numArr,num);
        System.out.println("Your element was found "+ occurrences +" time in the array");
    }

    public static int noofoccerences(int[] numArr, int num){
        int occ=0;
        int i=0;
        while(i<numArr.length)
        {
            if(numArr[i]==num){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
