public class RPS {

	public static void main(String[] args) {
		
		do {

			playRound();


		} while (playAgain()); // do-while

		System.out.println("Hey thanks for playing");

	} // main

	public static int roundWinner(String u, String c) {
		

		return 0;  // TODO: get rid of this in the final version
	} //roundWinner

	public static String generateComputerChoice() {


		return "";  // TODO: get rid of this in the final version

	} //generateComputerChoice  

	public static String getUserInput() {


		return "";   // TODO: get rid of this in the final version
	} //getUserInput

	public static boolean playAgain() {


		return false;   // TODO: get rid of this in the final version
	} //playAgain

	public static void playRound() {
		String userChoice;
		String computerChoice;
		int userScore = 0, computerScore = 0, tiesScore = 0;
		int winner;

		// Get a command from the user
		userChoice = getUserInput();

		// Generate a computer choice
		computerChoice = generateComputerChoice();

		// Pick a winner
		winner = roundWinner(userChoice, computerChoice);

		// Increment the appropriate score
		switch (winner) {

			case 0:
				userScore++;
				break;

			case 1:
				computerScore++;
				break;

			case 2:
				tiesScore++;
				break;

			default:
				System.out.println("Something very bad has happened.");
				break;

		} //switch

		// Display the scores
		printScores(userScore, computerScore, tiesScore);
		

	} //playRound

	public static void printScores(int u, int c, int t) {

	} //printScores

} // RPS (class)
