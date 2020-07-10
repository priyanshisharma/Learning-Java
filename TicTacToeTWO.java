import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToeTWO {
    static Scanner in;
    static char board[];
    static char turn;

    public static void main(String[] Args)
    {
        in = new Scanner(System.in);
        board = new char[9];
        turn = 'X';
        char winner = '\0';

        populateEmptyBoard();

        System.out.println("Welcome to the 2 player Tic-Tac-Toe!\nLet the battle begin!!!");
        System.out.println("May the best player win!\n\nX plays first.\n");

        printBoard();

        while(winner=='\0')
        {
            char numInput;
            try {
                numInput=in.next().charAt(0);
                if(!(numInput>'0'&&numInput<='9'))
                {
                    System.out.println("Invalid number, please select a number from 1 to 9");
                    continue;
                }
            }
            catch(InputMismatchException e)
            {
                System.out.println("Invalid entry! Go revise counting numbers :P");
                continue;
            }

            if(board[(numInput-'0')-1]== numInput)
            {
                board[numInput-'0'-1]=turn;

                if(turn=='X')
                    turn='O';
                else
                    turn='X';

                printBoard();
                winner = checkWinner();
            }
            else
            {
                System.out.println("This slot has been occupied, try again!");

            }

        }

        if(winner=='D')
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
    static char checkWinner()
    {
        for(int i=0; i<9; i++)
        {

            String line=null;
            switch (i)
            {
                case 0 :  line =  new StringBuilder().append(board[0]).append(board[1]).append(board[2]).toString();
                            break;
                case 1 :  line = new StringBuilder().append(board[1]).append(board[4]).append(board[7]).toString();
                            break;
                case 2 :  line = new StringBuilder().append(board[2]).append(board[5]).append(board[8]).toString();
                            break;
                case 3 :  line = new StringBuilder().append(board[0]).append(board[3]).append(board[6]).toString();
                            break;
                case 4  : line = new StringBuilder().append(board[4]).append(board[6]).append(board[2]).toString();
                            break;
                case 5 :  line = new StringBuilder().append(board[5]).append(board[3]).append(board[4]).toString();
                            break;
                case 6 :  line = new StringBuilder().append(board[6]).append(board[7]).append(board[8]).toString();
                            break;
                case 8 :  line = new StringBuilder().append(board[8]).append(board[0]).append(board[4]).toString();
                            break;
                default:   line = null;
            }
            if (line!=null&&line.equals("XXX"))
                return 'X';
            else if(line!=null&&line.equals("OOO"))
                return 'O';

        }
        for(char i='0';i<'9';i++)
        {
            if(board[i-'0']==i+1)
                break;
            else if(i=='8')
            {
                return 'D';
            }
        }
        return '\0';
    }

    static void populateEmptyBoard(){
        char i='0';
        while(i<'9')
        {
            board[i-'0'] = ++i;
        }
    }
}
