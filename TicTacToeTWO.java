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

        if((board[0]==board[1])&&(board[0]==board[2]))
        {
            return board[0];
        }
        else if((board[2]==board[5])&&(board[5]==board[8]))
        {
            return board[2];
        }
        else if((board[0]==board[3])&&(board[3]==board[6]))
        {
            return board[0];
        }
        else if((board[4]==board[6])&&(board[6]==board[2]))
        {
            return board[4];
        }
        else if((board[3]==board[5])&&(board[5]==board[4]))
        {
            return board[3];
        }
        else if((board[6]==board[7])&&(board[7]==board[8]))
        {
            return board[6];
        }
        else if((board[8]==board[0])&&(board[0]==board[4]))
        {
            return board[8];
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
