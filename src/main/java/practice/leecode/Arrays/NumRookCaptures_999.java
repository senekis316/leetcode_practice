package practice.leecode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class NumRookCaptures_999 {

    //方法二
    public int numRookCaptures(char[][] board) {
        int x = 0;
        int y = 0;
        List<Character> xs = new ArrayList();
        List<Character> ys = new ArrayList();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'R') {
                    for (int z = 0; z < board[i].length; z++) {
                        if (board[i][z] != '.') {
                            xs.add(board[i][z]);
                            if (board[i][z] == 'R') {
                                x = xs.size() - 1;
                            }
                        }
                    }
                    for (int z = 0; z < board.length; z++) {
                        if (board[z][j] != '.') {
                            ys.add(board[z][j]);
                            if (board[z][j] == 'R') {
                                y = ys.size() - 1;
                            }
                        }
                    }
                }
            }
        }
        int count = 0;
        if (x > 0 && xs.get(x - 1) == 'p') {
            count++;
        }
        if (x + 1 < xs.size() && xs.get(x + 1) == 'p') {
            count++;
        }
        if (y > 0 && ys.get(y - 1) == 'p') {
            count++;
        }
        if (y + 1 < ys.size() && ys.get(y + 1) == 'p') {
            count++;
        }
        return count;
    }


    //方法一
    /*public int numRookCaptures(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'R') {
                    for (int z = i; z >= 0; z--) {
                        if (board[z][j] == 'B') {
                            break;
                        }
                        if (board[z][j] == 'p') {
                            count++;
                            break;
                        }
                    }
                    for (int z = i; z < board.length; z++) {
                        if (board[z][j] == 'B') {
                            break;
                        }
                        if (board[z][j] == 'p') {
                            count++;
                            break;
                        }
                    }
                    for (int z = j; z >= 0; z--) {
                        if (board[i][z] == 'B') {
                            break;
                        }
                        if (board[i][z] == 'p') {
                            count++;
                            break;
                        }
                    }
                    for (int z = j; z < board[i].length; z++) {
                        if (board[i][z] == 'B') {
                            break;
                        }
                        if (board[i][z] == 'p') {
                            count++;
                            break;
                        }
                    }
                    return count;
                }
            }
        }
        return count;
    }*/

}
