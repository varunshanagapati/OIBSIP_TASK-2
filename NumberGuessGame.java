import java.util.*;
class NumberGuessGame{
    public static void main(String args[]){
        Random r=new Random();
        Scanner s=new Scanner(System.in);
        System.out.println("==================== Welcome to the Number Guessing Game  ====================");
        System.out.println("There are 5 chances to guess the number");
        System.out.println("The number is between 1 and 100");
        int points=0,round=0;
        boolean again=true;
        while(again){
            int val=r.nextInt(100);
            int atmpts=0;
            round++;
            System.out.println("==================== ROUND "+round+"  ====================");
            while(atmpts<5){
                System.out.print("Guess the Number : ");
                int guess=s.nextInt();
                if(guess==val){
                    System.out.println("Horray! You guessed the correct Number");
                    points++;
                    break;
                }else if(guess<val){
                    System.out.println("Number is too small! Try again.");
                    atmpts++;
                }else{
                    System.out.println("Number is too High! Try again.");
                    atmpts++;
                }
            }
            System.out.println("All attempts are completed");
            System.out.println("The Number was "+val);
            System.out.println("Do you want to play again?(yes/no)");
            String ag=s.next();
            if(ag.equals("no")){
                again=false;
            }
        }
        System.out.println("Game Over");
        System.out.println("Points earned: "+points);
        System.out.println("==================== THANKS FOR PLAYING :) ====================");
    }
}