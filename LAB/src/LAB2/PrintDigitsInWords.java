package LAB2;
import java.util.Scanner;

public class PrintDigitsInWords {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scanner.nextInt();
        printDigitsInWords(num);

    }

    public static void printDigitsInWords(int num){
        for(int i=0;i<3;i++){
            if(i==0){
                System.out.println("Zero ");
            }
            if(i==1){
                System.out.println("One ");
            }
            if(i==2){
                System.out.println("Two ");
            }
            if(i==3){
                System.out.println("Three ");
            }
            if(i==4){
                System.out.println("Four ");
            }
            if(i==5){
                System.out.println("Five ");
            }
            if(i==6){
                System.out.println("Six ");
            }
            if(i==7){
                System.out.println("Seven ");
            }
            if(i==8){
                System.out.println("Eight ");
            }
            if(i==9){
                System.out.println("Nine ");
            }

        }
    }
}
