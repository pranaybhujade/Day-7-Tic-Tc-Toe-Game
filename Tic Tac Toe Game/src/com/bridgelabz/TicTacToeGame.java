package com.bridgelabz;


public class TicTacToeGame {
    char gameBoard[] = null;
    char playerLetter = '\0';
    char computerLetter = '\0';
    String winner = null;
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        gameObj.showBoard();
        gameObj.playerPlays();
        gameObj.showBoard();
        gameObj.checkWinOrTie();
    }

    void initialiseGame() {
         else if (playerInput == 'O' || playerInput == 'o') {
            playerLetter = 'O';
            computerLetter = 'o';
        } else
		else{
            System.out.println("\nInvalid Input.\nPlease try again!");
            choosePlayerLetter();
        }
    }

    void showBoard() {
        else if (gameBoard[playerCell] != ' ') {
            int toss () {
                return (Math.random() > 0.5 ? 1 : 0);
            }

            void checkWinOrTie () {
                char winLetter = ' ';
                byte cellsStillEmpty = 0;
                winner = null;

                for (int pattern = 1; pattern < 9; pattern++) {
                    switch (pattern) {
                        case 1:
                            if (gameBoard[1] == gameBoard[2] && gameBoard[1] == gameBoard[3])
                                winLetter = gameBoard[1];
                            break;
                        case 2:
                            if (gameBoard[4] == gameBoard[5] && gameBoard[4] == gameBoard[6])
                                winLetter = gameBoard[4];
                            break;
                        case 3:
                            if (gameBoard[7] == gameBoard[8] && gameBoard[7] == gameBoard[9])
                                winLetter = gameBoard[7];
                            break;
                        case 4:
                            if (gameBoard[1] == gameBoard[4] && gameBoard[1] == gameBoard[7])
                                winLetter = gameBoard[1];
                            break;
                        case 5:
                            if (gameBoard[2] == gameBoard[5] && gameBoard[2] == gameBoard[8])
                                winLetter = gameBoard[2];
                            break;
                        case 6:
                            if (gameBoard[3] == gameBoard[6] && gameBoard[3] == gameBoard[9])
                                winLetter = gameBoard[3];
                            break;
                        case 7:
                            if (gameBoard[1] == gameBoard[5] && gameBoard[1] == gameBoard[9])
                                winLetter = gameBoard[1];
                            break;
                        case 8:
                            if (gameBoard[3] == gameBoard[5] && gameBoard[3] == gameBoard[7])
                                winLetter = gameBoard[3];
                            break;
                    }
                }
                winner = "me";
                if (winLetter == playerLetter)
                    winner = "PLAYER";
                else if (winLetter == computerLetter)
                    winner = "COMPUTER";
                else {
                    for (int counter = 1; counter <= 9; counter++) {
                        if (gameBoard[counter] == ' ')
                            cellsStillEmpty++;
                    }
                    if (cellsStillEmpty == 0)
                        winner = "TIE";
                }
                if (winner != null)
                    displayResults();
            }

            void displayResults () {
                if (winner == "TIE")
                    System.out.println("\n\nIt's a TIE!\nPlease try again.");
                else
                    System.out.println("\n\n" + winner + " wins!");

            }
        }
    }
}




