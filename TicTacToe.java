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
}