import java.util.Scanner;
import java.lang.Math;         //Scanner and Math main method are used

public class GuessingGame{
    public static void main(String[] args)
            
    {
        int answer =(int)(Math.random()*100)+1;
        int k=5;  
        Scanner input=new Scanner(System.in);
        boolean correct =false;
        System.out.println("yo should Think of a number between 1 to 100.\n 3 Trials left");
        
        
        while(k>0)
        {
            System.out.println("Enter your Guess Number:");
            int guess = input.nextInt();
            if(guess == answer)
            {
               System.out.println("You guessed The right Number!\n Congratulation You WIN");
               break;
            }
            else if(guess > answer)
            {
                System.out.println("Your Number Guess is too high  "+(k-1)+"tries left Guess Carefully");
                k--;
            }
            else
            {
                System.out.println("Your guess is too low  "+(k-1)+"tries left Guess carefully");
            }
            k--;
            
        }
        if(correct==false)
        {
            System.out.println("Tries are over.\n You lose the game");
        }
    }
            
}