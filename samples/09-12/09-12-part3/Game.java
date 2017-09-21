public class Game{
  private int tie = 0;
  private Human player;
  private CPU opponent;
  public int roundWinner(String u, String c){
    int result = 0;
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
  public void playRound(){
    // LET US CODE LATER
    int winner = roundWinner(userChoice, computerChoice);
    //System.out.println(winner);
    Human _hum = new Human();
    CPU _cpu = new CPU();

    switch (winner){
    case 0:
        System.out.println("Hey user, you are the winner. congrats...");
        _hum.incrementScore();
        break;
    case 1:
        System.out.println("Sorrrry user, you lost. Computer is the winner...");
        _cpu.incrementScore();
        break;
    case 2:
        System.out.println("Ahhhhhh it is tie. well you get some points....");
        numberOfTies++;
    default:
         break;
  }
  public void printScores(int x, int y, int z){

  }
  public static void main(String[] args){

  }
}
