package com.bridgelabz.snakeladder;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int player1Pos = 0, player2Pos = 0, count=0, play = 1;
        int[] ladderStartPos = {7, 16, 20, 36, 50, 63, 71};
        int[] ladderEndPos = {30, 33, 38, 83, 68, 81, 89};
        int[] snakeHeadPos = {25, 42, 56, 61, 92, 95, 98};
        int[] snakeTailPos = {3, 1, 48, 43, 67, 12, 80};

        while(player1Pos != 100 || player2Pos != 100) {
            if(play == 1) {
                int dice = (int) ((Math.random() * 10) % 6) + 1;
                player1Pos += dice;
                System.out.println("Player1 is at position: " + player1Pos);

                if (player1Pos == 100) {
                    System.out.println("Player1 wins the game");
                    break;
                } else if (player1Pos > 100) {
                    player1Pos -= dice;
                    System.out.println("Player1 is at position: " + player1Pos);
                }

                for (int i = 0; i < ladderStartPos.length; i++) {
                    if (player1Pos == ladderStartPos[i]) {
                        player1Pos = ladderEndPos[i];
                        System.out.println("climb up the ladder");
                        System.out.println("Player1 is at position: " + player1Pos);
                        play=1;
                    } else if (player1Pos == snakeHeadPos[i]) {
                        player1Pos = snakeTailPos[i];
                        System.out.println("Swallowed by snake");
                        System.out.println("Player1 is at position: " + player1Pos);
                        play=2;
                    }
                }
                play=2;
            }

            else if( play == 2){
                int dice = (int) ((Math.random() * 10) % 6) + 1;
                player2Pos += dice;
                System.out.println("Player2 is at position: " + player2Pos);

                if (player2Pos == 100) {
                    System.out.println("Player2 wins the game");
                    break;
                } else if (player2Pos > 100) {
                    player2Pos -= dice;
                    System.out.println("Player2 is at position: " + player2Pos);
                }

                for (int i = 0; i < ladderStartPos.length; i++) {
                    if (player2Pos == ladderStartPos[i]) {
                        player2Pos = ladderEndPos[i];
                        System.out.println("climb up the ladder");
                        System.out.println("Player2 is at position: " + player2Pos);
                        play=2;
                    } else if (player2Pos == snakeHeadPos[i]) {
                        player2Pos = snakeTailPos[i];
                        System.out.println("Swallowed by snake");
                        System.out.println("Player2 is at position: " + player2Pos);
                        play=1;
                    }
                }
                play=1;
            }

            count++;
        }

        System.out.println("Dice count=" + count);

    }
}


