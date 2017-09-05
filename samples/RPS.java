import java.util.Scanner;
import java.util.Random;
public class RPS{
int userScore =0;
int computerScore =0;
int numberOfTies = 0;
public static String getUserChoice(){
System.out.println("Please enter ROCK, PAPER or SCISSORS as choice to play the game....");
Scanner scan = new Scanner(System.in);
String choice = scan.next().toUpperCase();
// to upper case?
return choice;


}
public static String generateComputerChoice(){
System.out.println("Computer has chosen the following:");
String choiceFromComputer = "";
Random rand = new Random();
int choice = rand.nextInt(3);
if (choice == 0)
   choiceFromComputer = "ROCK";
else if (choice == 1)
   choiceFromComputer = "PAPER";
else 
   choiceFromComputer = "SCISSORS";

return choiceFromComputer;

}
public static int computeRoundWinner(String u, String c){
int result = 0;
// 0 -> mean user is winner
// 1 -> means computer is winner
// 2 -> means it is tie
if (u.equals(c))
    result = 2;
else if (u.equals("ROCK") && c.equals("PAPER"))
    result = 1;
else if (u.equals("ROCK") && c.equals("SCISSORS"))
    result = 0;
else if (u.equals("PAPER") && c.equals("ROCK"))
    result = 0;
else if (u.equals("PAPER") && c.equals("SCISSORS"))
    result = 1;
else if (u.equals("SCISSORS") && c.equals("PAPER"))
    result =  0;
else if (u.equals("SCISSORS") && c.equals("ROCK"))
    result = 1;
return result;




}
// main function 
public static void main(String[] args){
System.out.println("This is the RPS program. Let us get started !");
// user to enter some choice
String userChoice = getUserChoice();
//System.out.println(userChoice);

// generate choice for computer
String computerChoice = generateComputerChoice();
System.out.println(computerChoice);

int winner = computeRoundWinner(userChoice, computerChoice);
//System.out.println(winner);

switch (winner){
case 0:
    System.out.println("Hey user, you are the winner. congrats...");
    userScore++;
    break;
case 1:
    System.out.println("Sorrrry user, you lost. Computer is the winner...");
    computerScore++;
    break;
case 2:
    System.out.println("Ahhhhhh it is tie. well you get some points....");
    numberOfTies++;
default:
     break;

}

// comparison on these two choices 


// based on the comparison, I would compute who is the winner

}
}
