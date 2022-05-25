/**
* Name: Brandon Trapp
* hw2.java
*
* Problem: Playing 1000 games worth of craps. 
*
* Certification of Authenticity:
* <include one of the following>
* I certify that this lab/homework is entirely my own work.
* 
*/
public class HW2
{

    /**
     * main - drives the game of craps test of wins/losses in 10000 games
     */
    public static void main (String [] args)
    {
        // start a new game
        Craps game = new Craps();  // an instance of a Craps class
        // call the method that plays the game
        int wins = 0;// variable for wins
        int losses = 0; // variable for losses
        
        System.out.println("Welcome to the game of craps");
        
        //loops runs for 1000 games calculating total wins and losses
        for (int i=0; i < 1000; i++){ 
            if (game.playCraps() == 1){
                wins+=1;
            }else{
                losses+=1;
            }
            game.playCraps();
        }
        double probability;
        probability = ( wins +losses) ;
        double answer = wins / probability;
        System.out.println("wins: " +wins);
        System.out.println("losses: " +losses);
        System.out.printf("Probability: %.3f",answer);
        System.out.println("%");
       
    }
}
