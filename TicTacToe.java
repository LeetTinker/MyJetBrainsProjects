package tictactoe;
import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean x3 = false;
        Boolean o3 = false;
        int cntX = 0;
        int cntO = 0;
        char[][] board = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.println("|       |");
        }
        System.out.println("---------");
        for(;;) {
            for (; ; ) {
                int rowcd = 0;
                int colcd = 0;
                try {
                    rowcd = Integer.parseInt(sc.next());
                    colcd = Integer.parseInt(sc.next());
                } catch (NumberFormatException e) {
                    System.out.println("You should enter numbers!");
                    continue;
                }
                if (rowcd > 3 || colcd > 3 || rowcd < 1 || colcd < 1) {
                    System.out.println("Coordinates should be from 1 to 3!");
                    continue;
                }
                if (board[rowcd - 1][colcd - 1] == 'X' || board[rowcd - 1][colcd - 1] == 'O') {
                    System.out.println("This cell is occupied! Choose another one!");
                    continue;
                } else {
                    board[rowcd - 1][colcd - 1] = 'X';
                }
                System.out.println("---------");
                for (int i = 0; i < 3; i++) {
                    System.out.println(String.format("| %c %c %c |", board[i][0], board[i][1], board[i][2]));
                }
                System.out.println("---------");
                break;
            }
            for (int i = 0; i < 3; i++) {
                int row = 0;
                int clm = 0;
                int mDiag = 0;
                int aDiag = 0;

                for (int j = 0; j < 3; j++) {
                    row += board[i][j];
                    clm += board[j][i];
                    mDiag += board[j][j];
                    aDiag += board[j][2 - j];
                }
                // ASCII value for X is 88 (X+X+X is 264)
                // ASCII value for O is 79 (O+O+O is 237)
                x3 = x3 || row == 264 || clm == 264 || mDiag == 264 || aDiag == 264;
                o3 = o3 || row == 237 || clm == 237 || mDiag == 237 || aDiag == 237;
            }
            if (x3) {
                System.out.println("X wins");
                break;
            } else if (o3) {
                System.out.println("O wins");
                break;
            }
            for (; ; ) {
                int rowcd = 0;
                int colcd = 0;
                try {
                    rowcd = Integer.parseInt(sc.next());
                    colcd = Integer.parseInt(sc.next());
                } catch (NumberFormatException e) {
                    System.out.println("You should enter numbers!");
                    continue;
                }
                if (rowcd > 3 || colcd > 3 || rowcd < 1 || colcd < 1) {
                    System.out.println("Coordinates should be from 1 to 3!");
                    continue;
                }
                if (board[rowcd - 1][colcd - 1] == 'X' || board[rowcd - 1][colcd - 1] == 'O') {
                    System.out.println("This cell is occupied! Choose another one!");
                    continue;
                } else {
                    board[rowcd - 1][colcd - 1] = 'O';
                }
                System.out.println("---------");
                for (int i = 0; i < 3; i++) {
                    System.out.println(String.format("| %c %c %c |", board[i][0], board[i][1], board[i][2]));
                }
                System.out.println("---------");
                break;
            }
            for (int i = 0; i < 3; i++) {
                int row = 0;
                int clm = 0;
                int mDiag = 0;
                int aDiag = 0;

                for (int j = 0; j < 3; j++) {
                    row += board[i][j];
                    clm += board[j][i];
                    mDiag += board[j][j];
                    aDiag += board[j][2 - j];
                }
                // ASCII value for X is 88 (X+X+X is 264)
                // ASCII value for O is 79 (O+O+O is 237)
                x3 = x3 || row == 264 || clm == 264 || mDiag == 264 || aDiag == 264;
                o3 = o3 || row == 237 || clm == 237 || mDiag == 237 || aDiag == 237;
            }
            if (x3) {
                System.out.println("X wins");
                break;
            } else if (o3) {
                System.out.println("O wins");
                break;
            }
        }
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if(board[i][j]=='X'){
                    cntX++;
                }
                else if(board[i][j]=='O'){
                    cntO++;
                }
            }
        }
        if((cntX+cntO==9)&&(!x3)&&(!o3)){
            System.out.println("Draw");
        }


    }
}
