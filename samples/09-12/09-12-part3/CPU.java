public class CPU{

  private int points;
  /* constructor*/
  public CPU{

  }
  public int getScore(){
    int result = 0;
    return result;
  }
  public String generateInput(){
    String result = "";
    System.out.println("Computer has chosen the following:");

    Random rand = new Random();
    int choice = rand.nextInt(3);
    if (choice == 0)
       result = "ROCK";
    else if (choice == 1)
       result = "PAPER";
    else
       result = "SCISSORS";


    return result;
  }
  public void incrementScore(){
    // computation going to come soon...
    points++;
  }

}
