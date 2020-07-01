public class TicTacToe {
    static String board[];
    static String turn;

    public static void main(String[] Args)
    {
        board = new String[9];
        turn = "X";

        System.out.println("Welcome to the 2 player Tic-Tac-Toe!\nLet the battle begin!!!");
        System.out.println("May the best player win!\n\nX plays first.\n");

        printBoard();

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
            if (line == "XXX")
                return "X wins";
            else if(line == "OOO")
                return "Y wins";

        }
        return "Nobody won!";
    }
}
