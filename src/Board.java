public class Board {
    private String[][] board;
    private int[] columnStackArray;
    private boolean X_turn = false;
    int columns;
    public Board(int columns) {
        init_board(columns, columns);
        this.columns = columns;
        initColumnStackArray(columns);
    }

    public void render_board(){
        printTopLine();
        printColumns();
        printNumberPart();
        System.out.println("");
        printTurn();
    }

    private void printTurn(){
        if(X_turn){
            System.out.print("X");
        }
        else{
            System.out.print("O");
        }
        System.out.println(" it's your turn!");
    }

    public void drop_Play_Piece(int column){
        if (X_turn){
            dropX(column-1);
        }
        else{
            dropO(column-1);
        }
        X_turn = !X_turn;
    }

    private void dropX(int column){
        board[columnStackArray[column]][column] = "X";
        columnStackArray[column]--;
    }

    private void dropO(int column){
        board[columnStackArray[column]][column] = "O";
        columnStackArray[column]--;

    }

    public void init_board(int x, int y) {
        board = Fill_up_Board(x, y);
        render_board();
    }


    private void initColumnStackArray(int columns){
        columnStackArray = new int[columns];
        for (int i = 0; i < columns; i++){
            columnStackArray[i]= columns - 1;
        }
    }



    public String[][] Fill_up_Board(int x, int y) {
        String[][] filled_board = new String[x][y];
        for (int i = 0; i < filled_board.length; i++) {
            for (int j = 0; j < filled_board[i].length; j++) {
                filled_board[i][j] = " ";
            }
        }
        return filled_board;
    }

//    public void insertIntoBoard(String character, int pos_X, int pos_Y) {
//        board[pos_X][pos_Y] = character;
//    }
//
//    public void insertIntoBoard(char character, int pos_X, int pos_Y) {
//        board[pos_X][pos_Y] = Character.toString(character);
//    }

    public String getFromBoard(int pos_X, int pos_Y){
        return board[pos_X][pos_Y];
    }

    private void printTopLine() {
        for (
                int j = 0;
                j < board.length; j++) {
            if (j == 0) {
                System.out.print(" ");
            }

            if (j == board.length - 1) {
                System.out.println("____");
            } else {
                System.out.print("___");
            }
        }
    }

    private void printColumns() {
        for (
                int i = 0;
                i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                System.out.print(" |");

                if (j == board.length -1 ) {
                    System.out.println(board[i][j] + " |");

                } else {
                    System.out.print(board[i][j]);
                }
            }
            for (int j = 0; j < board[i].length; j++) {
                if (j == 0) {
                    System.out.print(" ");
                }

                if (j == board.length - 1) {
                    System.out.println("____");
                } else {
                    System.out.print("___");
                }
            }


        }
    }
    private void printNumberPart(){
        for (int i = 0; i < board.length; i++) {
            if (i <= 10) {
                System.out.print(" |");
            } else {
                System.out.print("|");
            }
            System.out.print(i+1);
        }
        System.out.println(" |");
    }



}
