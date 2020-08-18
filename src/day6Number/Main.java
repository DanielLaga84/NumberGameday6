package day6Number;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int randomNumber = (int) (Math.random() *100) + 1;
	boolean hasWon = false;
	System.out.println("Welcome  to the game ! Guess on what number i'm thinking right now.");


	Scanner scanner = new Scanner(System.in);
	for (int i = 10; i > 0; i--) {
	    System.out.println("You have " + i + "guess(es) left. Try again: ");
	    int guess = scanner.nextInt();


	    if(randomNumber < guess ) {
            System.out.println("It's smaller than " + guess + ".");
        }
        else if(randomNumber > guess ) {
            System.out.println("It's greater than " + guess + ".");
        }
        else if (randomNumber == guess ) {
            hasWon = true;
            break;
        }
    }
    if (hasWon) {
        System.out.println("Corret... You Win!!!");
    }else {
        System.out.println("GAME OVER... YOU LOOSE !!!");
        System.out.println("The number was : " + randomNumber);
    }
    }
}
