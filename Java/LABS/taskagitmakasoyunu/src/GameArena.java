public class GameArena {

    static boolean isGameOver = false;

    Player player1, player2;

    public void addPlayers( Player player1 , Player player2)
    {
    this.player1 = player1;
    this.player2 = player2;
    }

    public void startGame()
    {
        System.out.println("PLAY!");
      while(!isGameOver)
      {
        player1.move();
        player2.move();
        processMoves();
      }
      displayScores();
    }

    private void processMoves()
    {
        if( isGameOver )
        {
            return;
        }

        if(player1.sign == HandSign.PAPER && player2.sign == HandSign.ROCK){

            player1.wins++;
            System.out.println(player1.name +" WINS!");

        }else if( player1.sign == HandSign.ROCK && player2.sign == HandSign.SCISSOR) {

            player1.wins++;
            System.out.println(player1.name +" WINS!");

        }else if (player1.sign == HandSign.SCISSOR && player2.sign == HandSign.PAPER) {

            player1.wins++;
            System.out.println(player1.name +" WINS!");

        }else if( player1.sign == player2.sign){

            Player.draws++;
            System.out.println("Draws");

        }else{

            player2.wins++;
            System.out.println(player2.name +" WINS!");
        }

        System.out.println(player1.name+" "+player1.sign+" | "+player2.name+" "+player2.sign);
        Player.trials++;
    }

    private void displayScores()
    {

    System.out.println("Player1: "+player1.name+" Wins: "+player1.wins);
    System.out.println("Player2: "+player2.name+" Wins: "+player2.wins);
    System.out.println("Trials: "+ Player.trials+" Draws: "+Player.draws);

    }
}
