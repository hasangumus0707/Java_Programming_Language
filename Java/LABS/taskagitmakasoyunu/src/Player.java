import java.util.Scanner;

public class Player {

    String name;
    HandSign sign;
    int wins;
    static int draws;
    static int trials;

    public Player( String name )
    {
        this.name = name;
    }

    void move(){
        if (GameArena.isGameOver)
        {
            return;
        }

        boolean isInputInvalid;
        System.out.println("Enter move SCISSOR or ROCK or PAPER. Exit for q");
        Scanner input = new Scanner(System.in);

        do{
            char userChoice = input.next().charAt(0);
            isInputInvalid = false;
            switch( userChoice )
            {
                case 'p':
                    this.sign = HandSign.PAPER;
                    break;
                case 'r':
                    this.sign = HandSign.ROCK;
                    break;
                case 's':
                    this.sign = HandSign.SCISSOR;
                    break;
                case'q':
                    GameArena.isGameOver=true;
                    break;
                default:
                    isInputInvalid = true;
                    break;
            }

        }while(isInputInvalid);

        System.out.println(this.name + " " + sign);
    }
}
