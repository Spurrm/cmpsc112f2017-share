public class Human{
  private int points = 0;
  public Human(){

  }
  public int getScore(){
    int result =0;
    return result;

  }
  public String getInput(){
    String result = "";
    System.out.println("Please enter ROCK, PAPER or SCISSORS as choice to play the game....");
    Scanner scan = new Scanner(System.in);
    result = scan.next().toUpperCase();
    // to upper case?


    return result;
  }
  public void incrementScore(){
    points++;
  }
  public Boolean playAgain(){
    Boolean result = false;
    System.out.println("Do you want to play again? (Y/N)");
    Scanner scan = new Scanner(System.in);
    String playCondition = scan.next().toUpperCase();
    if (playCondition == "Y")
      result = true;


  }

}
