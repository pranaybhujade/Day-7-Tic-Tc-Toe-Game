package com.bridgelabz;


public class TicTacToeGame {
    char gameBoard[] = null;
    char playerLetter = '\0';
    char computerLetter = '\0';
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Welcome to the Tic Tac Toe Game Program in Java!");
        public static void main (String[]args){
            gameObj.initialiseGame();
            gameObj.choosePlayerLetter();
            gameObj.showBoard();
            gameObj.playerPlays();
        }

        void initialiseGame () {
            void choosePlayerLetter () {
                System.out.println("\nPlayer please choose your play Letter.");
                System.out.println("Enter 'X' to play 'X' on your turn.");
                System.out.println("Or Enter 'O' to play 'O' on your turn.");
                Scanner sc = new Scanner(System.in);
                char playerInput = sc.next().charAt(0);
                sc.close();
                if (playerInput == 'X' || playerInput == 'x') {
                    playerLetter = 'X';
                    computerLetter = 'O';
                    void showBoard () {
                        System.out.println("| " + gameBoard[7] + " | " + gameBoard[8] + " | " + gameBoard[9] + " |");
                        System.out.println("-------------");
                    }

                    void playerPlays () {
                        System.out.print("\nEnter an empty cell number [1-9] where do want make your move : ");
                        byte playerCell = sc.nextByte();
                        if (playerCell > 9 || playerCell < 1) {
                            System.out.println("\nInvalid selection.\nPlease try again!");
                            playerPlays();
                        } else if (gameBoard[playerCell] != ' ') {
                            System.out.println("\nThe cell you selected is not empty.\nPlease try again!");
                            playerPlays();
                        } else
                            gameBoard[playerCell] = playerLetter;
                    }

                }
            }
        }
    }



