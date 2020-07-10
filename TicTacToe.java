import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {
    static Scanner in;
    static String board[];
    static String turn;

    public static void main(String[] Args)
    {
        in = new Scanner(System.in);
        board = new String[9];
        turn = "X";
        String winner = null;

        populateEmptyBoard();

        System.out.println("Welcome to the 2 player Tic-Tac-Toe!\nLet the battle begin!!!");
        System.out.println("May the best player win!\n\nX plays first.\n");

        printBoard();

        while(winner==null)
        {
            int numInput;
            try {
                numInput=in.nextInt();
                if(!(numInput>0&&numInput<=9))
                {
                    System.out.println("Invalid number, please select a number from 0 to 9");
                    continue;
                }
            }
            catch(InputMismatchException e)
            {
                System.out.println("Invalid entry! Go revise counting numbers :P");
                continue;
            }

            if(board[numInput-1].equals(String.valueOf(numInput)))
            {
                board[numInput-1]=turn;

                if(turn.equals("X"))
                    turn="O";
                else
                    turn="X";

                printBoard();
                winner = checkWinner();
            }
            else
            {
                System.out.println("This slot has been occupied, try again!");

            }

        }

        if(winner.equals("draw"))
        {
            System.out.println("Its a draw!!!");
        }
        else
        {
            System.out.println(winner+" won!!!!!!");
        }

    }
    static void printBoard()
    {
        System.out.println("This is what the board looks like right now\n");
        System.out.println(board[0]+" | "+board[1]+" | "+board[2]);
        System.out.println("------------------------------");
        System.out.println(board[3]+" | "+board[4]+" | "+board[5]);
        System.out.println("------------------------------");
        System.out.println(board[6]+" | "+board[7]+" | "+board[8]);
    }
    static String checkWinner()
    {
        for(int i=0; i<9; i++)
        {

            String line=null;
            switch (i)
            {
                case 0 :  line = board[0]+board[1]+board[2];
                            break;
                case 1 :  line = board[1]+board[4]+board[7];
                            break;
                case 2 :  line = board[2]+board[5]+board[8];
                            break;
                case 3 :  line = board[0]+board[3]+board[6];
                            break;
                case 4  : line = board[4]+board[6]+board[2];
                            break;
                case 5 :  line = board[5]+board[3]+board[4];
                            break;
                case 6 :  line = board[6]+board[7]+board[8];
                            break;
                case 8 :  line = board[8]+board[0]+board[4];
                            break;
                default:   line = null;
            }
            if (line!=null&&line.equals("XXX"))
                return "X";
            else if(line!=null&&line.equals("OOO"))
                return "O";

        }
        for(int i=0;i<9;i++)
        {
            if(board[i].equals(String.valueOf(i+1)))
                break;
            else if(i==8)
            {
                return "draw";
            }
        }
        return null;
    }

    static void populateEmptyBoard(){
        for(int i=0; i<9; i++)
        {
            board[i] = String.valueOf(i+1);
        }
    }
}
