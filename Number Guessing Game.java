import java.util.Scanner;

public class NumberGuessing{
    public static void main(String[] args) {

        int random= (int) (Math.random() * 100);
        int guess;
        int Tires=0;


        System.out.println("\n  **  WELCOME TO NUMBER GUESSING GAME  ** ");
        System.out.println("Guess The Number Between 1 To 100.");

        Scanner sc=new Scanner(System.in);

        do{
            System.out.print("\nEnter Your Guess: ");
             guess=sc.nextInt();
             Tires++;

             if(random>guess){
                 System.out.println("please guess the higher.. ");
             }
             else if(random<guess){
                 System.out.println("please guess the lower..");
             }
             else{
                 System.out.println("\n Awesome! You Guess The Correct Number.");
                 System.out.println("You have Guess Number In " + Tires + " Tires." );
             }
        }
        while(random!=guess);



    }
}
