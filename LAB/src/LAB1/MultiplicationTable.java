package LAB1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= scanner.nextInt();
        for(int i=1;i<11;i++){
            System.out.println(num+" X "+i+" = "+num*i);
        }
    }
}
