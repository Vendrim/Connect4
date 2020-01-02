import java.util.Scanner;

public class UI {
    // PURPOSE: - PrintOut a Welcome Menu -- done
    //          - Ask User how big Board is supposed to be --done
    //          - If Single-Player or Multi-Player --done
    //              - If Single-Player choose difficulty (1 - 3)
    //          - After Choice is made show board to user, while user is playing. --done


//           ******                                               **        **
//          **////**                                             /**       */*
//         **    //   ******  *******  *******   *****   *****  ******    * /*
//        /**        **////**//**///**//**///** **///** **///**///**/    ******
//        /**       /**   /** /**  /** /**  /**/*******/**  //   /**    /////*
//        //**    **/**   /** /**  /** /**  /**/**//// /**   **  /**        /*
//         //****** //******  ***  /** ***  /**//******//*****   //**       /*
//         //////   //////  ///   // ///   //  //////  /////     //        //
//
//


    Scanner scanner = new Scanner(System.in);
    String input;
    int[] configuration = new int[2];
    Logic logic ;
    Board board;
    public UI() {

        printTitle();
        printMakersRights();
        askIfSingleOrMultiplayer();
        input = scanner.next();
        configuration = analyseChoice(Integer.parseInt(input));
        board = new Board(configuration[1]);
        logic = new Logic(board);




    }

    public void do_game(){
        while(!(logic.checkIfFourConnect())){
            board.drop_Play_Piece(Integer.parseInt(scanner.next()));
            board.render_board();

        }
    }
    private void printTitle() {
        System.out.println("           ######                                                ##         ##");
        System.out.println("          ##////##                                              /##        #/#");
        System.out.println("         ##    //    ######   #######  ######    #####   #####  ######    #/ #");
        System.out.println("        /##         ##////##//##///##//##///##  ##///## ##///##///##/    ######");
        System.out.println("        /##        /##   /## /##  /## /##  /## /#######/##  //   /##    /////#");
        System.out.println("       //##     ## /##   /## /##  /## /##  /## /##//// /##   ##  /##        /#");
        System.out.println("         //######  //######  ###  /## ###  /## //######//#####   //##       /#");
        System.out.println("          //////    //////  ///   // ///   //   //////  /////     //        //");

    }

    private int[] analyseChoice(int choice) {
        int[] columns = new int[2];
        if (choice == 1 || choice == 2) {
            columns[0] = choice;
            columns[1] = askUserHowBigBoard();
        } else {
            System.out.println("Please press 1 or 2 to play.");
            analyseChoice(Integer.parseInt(scanner.next()));
        }
        return columns;
    }

    private int askUserHowBigBoard() {
        System.out.println("On how many columns would you like to play? :");
        String k = scanner.next();
        return Integer.parseInt(k);
    }

    private void printMakersRights() {
        System.out.println();
        System.out.println();
        System.out.println("                                                                            made by Vendrim");
    }

    private void askIfSingleOrMultiplayer() {
        System.out.println("1) Single Player");
        System.out.println("2) Multi  Player");
    }

    public Scanner getScanner() {
        return scanner;
    }

}
