/*
PURPOSE: This Class is supposed to have all the methods, that are needed to recognize if one of the players won in the game.
         If in any case other methods, where game logic needs to be implemented are needed , they are to be stored here aswell.

Tasks:  - Logic Class needs to be able to detect a diagonal, horizontal and vertical 4-Piece line.
        - (optional) Write a interface to limit the access to the Board Class.

Conditions:
        - The direction of the line does not matter. Meaning that it needs to recognize a
            4 piece line be it left to right , right to left, up, down, etc.
        - Logic Class should not be reading the numbers that are printed out to the screen.
        - Logic Class only gets a copy of the board instance. It may not call upon board methods, besides
        scanning the board.
        - Maybe implement a interface for Board to do as stated above.
 */


public class Logic {

    Board board;

    public Logic(Board board) {
        this.board = board;
    }


    // Checks if on the board there are 4 of the same piece in a diagonal right.
    private boolean checkIfDiagonalRight(int x, int y) {
        try {
            if (board.getFromBoard(x, y) == board.getFromBoard(x + 1, y + 1) &&
                    board.getFromBoard(x, y) == board.getFromBoard(x + 2, y + 2) &&
                    board.getFromBoard(x, y) == board.getFromBoard(x + 3, y + 3)) {
                System.out.println("Diagonal right win");
                return true;
            }
            else{
                return false;
            }
        } catch (Exception e) {
            System.err.println("Diagonal right error");
            return false;
        }

    }

    private boolean checkIfDiagonalLeft(int x, int y) {
        try {
            if (board.getFromBoard(x, y) == board.getFromBoard(x - 1, y + 1) &&
                    board.getFromBoard(x, y) == board.getFromBoard(x - 2, y + 2) &&
                    board.getFromBoard(x, y) == board.getFromBoard(x - 3, y + 3)) {
                System.out.println("Diagonal left win");
                return true;
            }
            else {
                return false;
            }
        } catch (Exception e) {
            System.err.println("Diagonal Left error");
            return false;
        }

    }

    private boolean checkIfHorizontal(int x, int y) {
        try {
            if (board.getFromBoard(x, y) == board.getFromBoard(x , y+1) &&
                    board.getFromBoard(x, y) == board.getFromBoard(x, y+2) &&
                    board.getFromBoard(x, y) == board.getFromBoard(x, y+3)) {
                System.out.println("Horizontal Win");
                return true;
            }
            else{
                return false;
            }
        } catch (Exception e) {
            System.err.println("Horizonal error.");
            return false;
        }


    }

    private boolean checkIfVertical(int x, int y) {
        try {
            if (board.getFromBoard(x, y) == board.getFromBoard(x+1, y ) &&
                    board.getFromBoard(x, y) == board.getFromBoard(x+2, y ) &&
                    board.getFromBoard(x, y) == board.getFromBoard(x+3, y )) {
                System.out.println("Vertical Win!");
                return true;
            }
            else{
                return false;
            }
        } catch (Exception e) {
            System.err.println("Vertical error" );
            return false;
        }
    }

    public boolean checkIfFourConnect() {
        boolean four_connect = false;
        for (int i = 0; i < board.columns; i++) {
            for (int j = 0; j < board.columns; j++) {
                if (board.getFromBoard(j, i) == "X" || board.getFromBoard(j, i) == "O") {
                    four_connect = checkIfDiagonalLeft(j, i) || checkIfDiagonalRight(j, i) || checkIfHorizontal(j, i) || checkIfVertical(j, i);
                    if(four_connect){
                        return true;
                    }
                }
            }
        }

        return false;
    }

}
