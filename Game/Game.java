// rock paper scissors and pig
//11/15/15
//Lu Peng and Katelyn Le

import java.util.*;

public class Game{
    public static void main (String[] args){
        play();
    }
    
    public static void play(){
        Scanner sc = new Scanner (System.in);
        Random generator = new Random();
        int count = 0;
        int userPoints = 0;
        int compPoints = 0;
        System.out.println("How many rounds do you want to play?");
        int rounds = sc.nextInt();
        while (count<rounds){
            System.out.println("Choose rock, papaer or scissors");
            System.out.println ("rock = 0, paper = 1, scissors = 2");
            int userMove = sc.nextInt();
            int compMove = generator.nextInt(3);
            if (compMove == 0){
                System.out.println ("The computer chose rock");
                if (userMove == 0){
                    System.out.println ("It's a tie");
                }else if (userMove == 1){
                    System.out.println ("You won the round");
                    userPoints +=1;
                }else{
                    System.out.println("You lost the round");
                    compPoints += 1;
                }
            }else if (compMove == 1){
                System.out.println("The computer chose paper");
                if (userMove == 0){
                   System.out.println("You lost the round");
                   compPoints += 1;
                }else if (userMove == 1){
                    System.out.println ("It's a tie");
                }else {
                    System.out.println ("You won the round");
                    userPoints +=1;
                }
            }else {
                System.out.println ("The computer chose scissors");
                if (userMove == 0){
                    System.out.println ("You won the round");
                    userPoints +=1;
                }else if (userMove == 1){
                    System.out.println("You lost the round");
                    compPoints += 1;
                }else {
                    System.out.println ("It's a tie");
                }
            }
            count ++;
        }
        scoreCompare (userPoints, compPoints);
        playAgain(sc);
    }
    
    public static void playAgain(Scanner sc){
        System.out.println ("Do you want to play again?");
        System.out.println("yes = 0, no = 1");
        int again = sc.nextInt();
        if (again == 1){
            System.out.println ("End of game");
        }else{
            play();
        }
    }
    
    public static void scoreCompare (int userPoints, int compPoints){
        if (userPoints > compPoints){
            System.out.println ("You win!");
        }else if (userPoints < compPoints){
            System.out.println("You lose!");
        }else{
            System.out.println("It's a tie!");
        }
    }
}
       
                 
                
       