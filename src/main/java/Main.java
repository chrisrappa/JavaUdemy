public class Main {

  public static void main(String[] args) {

  String playerMessage;

  playerMessage = displayHighScorePosition(1500, "Ollie");
  System.out.println(playerMessage);

  playerMessage = displayHighScorePosition(900, "John");
  System.out.println(playerMessage);

  playerMessage = displayHighScorePosition(400, "Mary");
  System.out.println(playerMessage);

  playerMessage = displayHighScorePosition(50, "Tim");
  System.out.println(playerMessage);

  }

  public static String displayHighScorePosition(int playerScore, String playerName){

    int newPlayerPosition = calculateHighScorePosition(playerScore);
    String playerMessage = playerName + " managed to get to " + newPlayerPosition + " on the high score table ";
    return(playerMessage);

  }

  public static int calculateHighScorePosition(int playerScore){
    if(playerScore > 1000){
      return(1);
    } else if (playerScore > 500 && playerScore < 1000) {
      return(2);
    } else if (playerScore > 100 && playerScore < 500){
      return(3);
    }

    return(4);
  }
}