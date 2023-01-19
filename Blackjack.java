import java.util.Scanner;
import java.util.Random;

public class Blackjack {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
// heading
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Welcome To the Blackjack Table");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
// starts the while loop
        String playAgain = "y";
// initializes the variables in order to print game statistics
        int playerWins = 0;
        int dealerWins = 0;
        int ties = 0;
// starts the large while loop for the game
        while ( playAgain.equals("y") ) {
            System.out.println("Player’s Turn +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-"); // prints out players first two cards and then asks if they want to hit or stand
            int cardValue = new Random().nextInt(11) + 1;
            System.out.println("Card: " + cardValue + " Current Total: " + cardValue);
            int cardValue2 = new Random().nextInt(11) + 1;
            System.out.println("Card: " + cardValue2 + " Current Total: " + (cardValue + cardValue2));
            System.out.print("(h)it or (s)tand?: ");
            String hitStand = scnr.next();

            int total = cardValue + cardValue2; // adds up the first two card values just in case the player wants to stand

            while (!hitStand.equals("h") && !hitStand.equals("s")) { // if a player inputs the wrong values it will keep asking them the question
                System.out.print("(h)it or (s)tand?: ");
                hitStand = scnr.next();
            }

            if (hitStand.equals("s")) { // if a player stands it will just print their total
                System.out.println("Player’s total is: " + total);
            }

            while (hitStand.equals("h") && total < 21) { // it will keep asking you to hit until you hit stand, or you bust or reach 21
                int cardValue3 = new Random().nextInt(11) + 1;
                System.out.println("Card: " + cardValue3 + " Current Total: " + (total + cardValue3));
                total = total + cardValue3;
                if (total >= 21) {
                    System.out.println("Player’s total is: " + total);
                    break; // breaks out of inner loop
                }
                System.out.print("(h)it or (s)tand?: ");
                hitStand = scnr.next();
                if (hitStand.equals("s")) {
                    System.out.println("Player’s total is: " + total);
                }
            }

            System.out.println("Dealer’s Turn +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-"); // dealers turn, gives dealer its first two cards
            int DCardValue1 = new Random().nextInt(11) + 1;
            System.out.println("Card: " + DCardValue1 + " Current Total: " + DCardValue1);
            int DCardValue2 = new Random().nextInt(11) + 1;
            System.out.println("Card: " + DCardValue2 + " Current Total: " + (DCardValue2 + DCardValue1));

            int dealerTotal = DCardValue1 + DCardValue2;

            if (dealerTotal >= 17) { // if dealers total is 17 or greater it will just print dealers total
                System.out.println("Dealer’s total is: " + dealerTotal);

            }

            while (dealerTotal < 17) { // if dealers card values are below 17 it will keep giving cards until the condition is false
                int DCardValue3 = new Random().nextInt(11) + 1;
                System.out.println("Card: " + DCardValue3 + " Current Total: " + (dealerTotal + DCardValue3));
                dealerTotal = dealerTotal + DCardValue3;

                if (dealerTotal >= 17) { // checks everytime there is a new card to see if the condition is met
                    System.out.println("Dealer’s total is: " + dealerTotal);
                    break;
                }
            }

//to see if dealer or player won, or if there was a tie
            if ( ( (dealerTotal <= 21) && (total > 21) ) || ( ( (21 - dealerTotal) < (21 - total) ) && (dealerTotal < 21) && (total < 21) ) || (dealerTotal == 21 && total < 21) )  {
                System.out.println("Dealer wins!");
                dealerWins++;
            } else if ( ( (total <=  21) && (dealerTotal > 21) ) || ( (21 - total) < (21 - dealerTotal) ) ) {
                System.out.println("Player wins!");
                playerWins++;
            } else if ( (dealerTotal >= 21 && total >= 21) || dealerTotal == total) {
                System.out.println("It's a tie!");
                ties++;
            }

// asks user if they want to play again
            System.out.println("Play again? [y/n]"); // if the user inputs y it will go back to the main while loop and the condition will be true so the game will run again
            playAgain = scnr.next();
// if user inputs wrong values it will keep asking them until they give a legit value
            while (!playAgain.equals("y") && !playAgain.equals("n")) {
                System.out.print("Play again? [y/n]");
                playAgain = scnr.next();
            }
// if the user inputs n it will end the code and give the game statistics
            if (playAgain.equals("n"))
            {
                System.out.println("GAME STATISTICS -------------");
                System.out.println("Player 1 won " + playerWins + " times");
                System.out.println("Dealer won " + dealerWins + " times");
                System.out.println(ties + " ties");
            }

        }

    }
}
