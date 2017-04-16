package playground.codeWars;

import java.util.Scanner;

/**
 * Created by aaron on 3/17/17.
 */
public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String line = scanner.nextLine();
            if (line.equals("=========")) {
                break;
            }
            char[][] board = new char[3][3];
            fillBoard(line, board);
            char winner = whoWon(board);

            if (winner != ' ') {
                System.out.printf("Player %s won.\n", winner);
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(board[i][j]);
                    }
                    System.out.println("");
                }
            } else {
                System.out.println("There was a tie.");
            }
        }
    }

    public static char whoWon(char[][] board) {
        StringBuffer s3 = new StringBuffer();
        StringBuffer s4 = new StringBuffer();
        for (int i = 0; i < 3; i++) {
            StringBuffer s1 = new StringBuffer();
            StringBuffer s2 = new StringBuffer();
            s3.append(board[i][i]);
            s4.append(board[2-i][i]);
            for (int j = 0; j < 3; j++) {
                s1.append(board[i][j]);
                s2.append(board[j][i]);
                if (s1.toString().equals("OOO")) {
                    for (int k = 0; k < 3; k++) {
                        board[i][k] = '$';
                    }
                    return 'O';
                } else if (s1.toString().equals("XXX")) {
                    for (int k = 0; k < 3; k++) {
                        board[i][k] = '$';
                    }
                    return 'X';
                }
                if (s2.toString().equals("OOO")) {
                    for (int k = 0; k < 3; k++) {
                        board[k][i] = '$';
                    }
                    return 'O';
                } else if (s2.toString().equals("XXX")) {
                    for (int k = 0; k < 3; k++) {
                        board[k][i] = '$';
                    }
                    return 'X';
                }
            }
        }
        if (s3.toString().equals("OOO")) {
            for (int k = 0; k < 3; k++) {
                board[k][k] = '$';
            }
            return 'O';
        } else if (s3.toString().equals("XXX")) {
            for (int k = 0; k < 3; k++) {
                board[k][k] = '$';
            }
            return 'X';
        }
        if (s4.toString().equals("OOO")) {
            for (int k = 0; k < 3; k++) {
                board[2-k][k] = '$';
            }
            return 'O';
        } else if (s4.toString().equals("XXX")) {
            for (int k = 0; k < 3; k++) {
                board[2-k][k] = '$';
            }
            return 'X';
        }
        return ' ';
    }


    public static void fillBoard(String line, char[][] board) {
        int row, col;
        for(int i = 0; i < line.length(); i++) {
            row = i / 3;
            col = i % 3;
            board[row][col] = line.charAt(i);
        }
    }
}
