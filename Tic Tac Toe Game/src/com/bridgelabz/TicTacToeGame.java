package com.bridgelabz;


public class TicTacToeGame {
    public static void main(String[] args) {
        TicTacToeGame gameObj = new TicTacToeGame();
        gameObj.initialiseGame();
        if (gameObj.toss() == 1)
            System.out.println("\nPlayer won the toss.\nPlayer plays first.");
        else
            System.out.println("\nComputer won the toss.\nComputer plays first.");
        gameObj.choosePlayerLetter();
        gameObj.showBoard();
        gameObj.playerPlays();
         else if (gameBoard[playerCell] != ' ') {
		else
            gameBoard[playerCell] = playerLetter;
        }

        int toss() {
            return (Math.random() > 0.5 ? 1 : 0);
    }
        }
    }




