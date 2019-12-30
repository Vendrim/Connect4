import java.util.Scanner;

public class UI {
    // PURPOSE: - PrintOut a Welcome Menu
    //          - Ask User how big Board is supposed to be
    //          - If Single-Player or Multi-Player
    //              - If Single-Player choose difficulty (1 - 3)
    //          - After Choice is made show board to user, while user is playing.



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
    Scanner scanner;
    String input;
    public UI(){
        scanner = new Scanner(System.in);
        printWelcomeMenu();
        printMakersRights();
        askIfSingleOrMultiplayer();
    }

    private void printWelcomeMenu() {
        System.out.println("           ******                                               **        **");
        System.out.println("          **////**                                             /**       */*");
        System.out.println("         **    //   ******  *******  *******   *****   *****  ******    * /*");
        System.out.println("        /**        **////**//**///**//**///** **///** **///**///**/    ******");
        System.out.println("        /**       /**   /** /**  /** /**  /**/*******/**  //   /**    /////*");
        System.out.println("       //**    **/**   /** /**  /** /**  /**/**//// /**   **  /**        /*");
        System.out.println("         //****** //******  ***  /** ***  /**//******//*****   //**       /*");
        System.out.println("         //////   //////  ///   // ///   //  //////  /////     //        //");
    }


        void askUserHowBigBoard(){

        }

        private void printMakersRights(){
            System.out.println();
            System.out.println();
            System.out.println("                                                                            made by Vendrim");
        }

        private void askIfSingleOrMultiplayer(){
        System.out.println("1) Single Player");
        System.out.println("2) Multi  Player");
        input = scanner.next();
    }

}
