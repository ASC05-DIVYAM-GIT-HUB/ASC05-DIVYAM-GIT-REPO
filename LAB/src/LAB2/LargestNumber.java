package LAB2;
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        System.out.println("The largest Number is: "+largestNumber(a,b,c));
    }
    public static int largestNumber(int a,int b,int c){
        return Math.max(a,Math.max(b,c));
    }
}
