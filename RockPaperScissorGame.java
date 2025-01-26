import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println("\nWelcome to Rock, Paper, Scissor Game");
        System.out.println("Choose your move:");
        System.out.println("0. Rock");
        System.out.println("1. Paper");
        System.out.println("2. Scissor");

        System.out.print("\nEnter your choice(0/1/2): ");
        int userInput=sc.nextInt();

        Random rand=new Random();
        int computerInput= rand.nextInt(3);


        if(computerInput==userInput){
            System.out.println("Draw!");
        } else if ( userInput==0 && computerInput==2|| userInput==1 && computerInput==0 || userInput==2 && computerInput==1) {
            System.out.println("You Win! ");
        }
        else {
            System.out.println("Computer Win!");
        }


        if(computerInput==0){
            System.out.println("computer choice: Rock");
        } else if (computerInput==1) {
            System.out.println("computer choice: Paper");
        }else{
            System.out.println("computer choice: Scissor");
        }


        if(userInput==0){
            System.out.println("your choice: Rock");
        } else if (userInput==1) {
            System.out.println("your choice: Paper");
        }else{
            System.out.println("your choice: Scissor");
        }


    }
}
