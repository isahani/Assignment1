package edu.wctc;
import java.util.Scanner;
public class Main {
    // creating a method called myMethod
    static void myMethod()
    {
        System.out.println("Enter 0 for the preference on the left \nEnter 1 for the preference on the right");
    }
    //creating another method in which we can pass array
    static void checkScore(int [] totalScore){
        int score = 0;
        for (int i = 0; i < totalScore.length; i++) {
            score += totalScore[i];
        }
        System.out.println("Your score: " + score);
        if (score < 3){
            System.out.println("You prefer life to be calm and organized.");
        }
        else if (score > 3){
            System.out.println("You prefer life to be spontaneous and active.");
        }
        else {
            System.out.println("You prefer a good balance in life.");
        }
    }

    public static void main(String[] args) {
        Scanner userReply = new Scanner(System.in);
        //use of a boolean variable
        Boolean FinalAnswer = true;
        // creating a String array to hold the choice prompts
        String[] choices = {"mild or spicy", "tea or coffee", "breakfast or brunch", "summer or winter","paper or plastic"};
        // creating An int array that has the same size as the String array to hold the user's input
        int[] userInput = new int[choices.length];
        //Loops to handle repeating behaviors
        do{
            System.out.println("Welcome to the preference Quiz!");
            for (int i = 0; i < choices.length; i++)  {
                System.out.println("Do you prefer " + (choices[i]) + "?");
                myMethod();
                userInput[i] = userReply.nextInt();
            }
            checkScore(userInput);
            System.out.println("Again? Press 1 to play again, or any other key to exit.");
            int response = userReply.nextInt();
            if (response == 1)
            {
                FinalAnswer = true;
            } else {
                FinalAnswer = false ;
            }
        } while (FinalAnswer == true);




    }


}


