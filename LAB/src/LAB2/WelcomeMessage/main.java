package LAB2.WelcomeMessage;
import LAB2.WelcomeMessage.WelcomeMessage;


import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String Name= scanner.nextLine();
        System.out.println(WelcomeMessage.welcomeMessage(Name));
    }
}
