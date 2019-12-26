public class main {

   static String[][] board = new String[20][20];

    public static String[][] Fill_up_Board(String[][] to_fill){
        String[][] filled_board = new String[to_fill.length][to_fill[0].length];

        for (int i = 0; i < filled_board.length; i++){
            for (int j = 0 ; j < filled_board[i].length; j++){
                filled_board[i][j] = " ";
            }
        }


        return filled_board;
    }

    public static void main(String[] args) {
        board = Fill_up_Board(board);

        board[3][4] = "X";

        for (int j = 0; j < board.length; j++){
            if (j == 0){
                System.out.print(" ");
            }

            if ( j == board.length-1) {
                System.out.println("____");
            }
            else{
                System.out.print("___");
            }
        }
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){

                    System.out.print(" |");

                if ( j == board.length-1) {
                    System.out.print("  |");
                    System.out.println(board[i][j]);
                }
                else{
                    System.out.print(board[i][j]);
                }
            }
            for (int j = 0; j < board[i].length; j++){
                if (j == 0){
                    System.out.print(" ");
                }

                if ( j == board.length-1) {
                    System.out.println("____");
                }
                else{
                    System.out.print("___");
                }
            }


        }
        for(int i = 0; i < board.length; i++){
            if (i <= 10) {
                System.out.print(" |");
            }
            else{
                System.out.print("|");
            }
            System.out.print(i);
        }
        System.out.println("|");
    }

}
