import java.util.Scanner;
public class arraysearching {
public static void main(){
    Scanner input=new Scanner(System.in);
    int arr[]={1,33,55,0,63,82,44,92,54,74};
    System.out.println("Enter a number ");
    int num= input.nextInt();
    boolean isfound=isfound(arr,num);
    if(isfound){
        System.out.print("Number is found in array ");
    }else {
        System.out.print("Number is not found ");
    }
}
public static boolean isfound(int  arr[],int num){
    int index=0;
    while(index<arr.length){
if(arr[index]==num){
    return true;
} index++;
    }
    return false;
}
}
