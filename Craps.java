/**
* Name: Brandon Trapp
* craps.java
*
* Problem: Play a game of craps if user wins return 1 if user losses return 0. 
* Certification of Authenticity:
* <include one of the following>
* I certify that this lab/homework is entirely my own work.
*

/**
 *  Craps.java - simulates the dice game of craps
 *  to watch the game, uncomment the "commented-out" print statements
 * 
 *  Shell provide by McCauley
 * 
 * 
 */
public class Craps
{
    /** 
     * instance variables
     */
    private Die die1 = new Die();
    private Die die2 = new Die();
        
    /**
     * playCraps - simulates a single game of craps
     * @return - 1 indicates a win, 0 a loss  
     * 
     */  
    public int playCraps()
    {
       // Your code goes here - remove the print provided
       int dice1 = die1.roll();
       int dice2 = die2.roll();
       int total = dice1 + dice2;
       int point = total;
       
       if (((total) == 7) || ((total) == 11)){
           return 1; 
       }
       if (((total) == 2) || ((total) == 3) || ((total) == 12)){
           return 0;
       }
       
       dice1 = die1.roll();
       dice2 = die2.roll();
       total = dice1 + dice2;
       while ((total != point) && (total != 7)){
           dice1 = die1.roll();
           dice2 = die2.roll();
           total = dice1 + dice2;
           
       }
       if (total == 7){
           return 0;
       }
       
       return 1;  // change this to return the correct result
    }
}