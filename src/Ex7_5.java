/**
 *
 */
package com.company;

import com.googlecode.lanterna.*;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;
import java.nio.charset.Charset;
import java.util.Random;

public class Ex7_5 {
    public static void main(String[] args) throws InterruptedException {

        Terminal terminal = TerminalFacade.createTerminal
                (System.in, System.out, Charset.forName("UTF8"));

        terminal.enterPrivateMode();

        int [][] board = new int [20][20];
        Random rand = new Random();

      /*  for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[i].length;j++) {
                board[i][j]=rand.nextInt(255);
            }
        }*/

        while(true) {

            int xx = rand.nextInt(20);
            int yy = rand.nextInt(20);
            board[xx][yy]=rand.nextInt(255);

            for (int u = 0; u < board.length; u++) {
                for (int ux = 0; ux < board[u].length; ux++) {

                    terminal.moveCursor(u, ux);
                    terminal.applyForegroundColor(board[u][ux]);
                    terminal.putCharacter('\u263a');
                }
            }


            int [][] tmpboard = new int[20][20];

            for (int y = 0; y <20; y++) {      // Överdrivet ..
                for (int x = 0; x <20;x++) {
                    int color = 0;
                    if (y==0 && x== 0) { //vänster övre hörn
                        color +=board[y][x];
                        color +=board[y+1][x];
                        color +=board[y][x+1];
                        color +=board[y+1][x+1];
                        if (color>0)
                            color/=4;
                    }

                    else if(y==0 && x==19) { // höger övre hörn
                        color+=board[y][x];
                        color+=board[y][x-1];
                        color+=board[y+1][x-1];
                        color+=board[y+1][x];
                        if (color>0)
                            color/=4;
                    }
                   else if (y==19 && x==0) { // vänster nedre hörn
                        color+=board[y][x];
                        color+=board[y][x+1];
                        color+=board[y-1][x];
                        color+=board[y-1][x+1];
                        if (color>0)
                            color/=4;
                    }

                   else if(y==19 && x==19) { // högre nedre hörn
                        color+=board[y][x];
                        color+=board[y-1][x];
                        color+=board[y-1][x-1];
                        color+=board[y][x-1];
                        if (color>0)
                            color/=4;
                    }

                   else if (y==0) { // övre kant
                        color+=board[y][x];
                        color+=board[y][x-1];
                        color+=board[y][x+1];
                        color+=board[y+1][x-1];
                        color+=board[y+1][x];
                        color+=board[y+1][x+1];
                        if (color>0)
                            color/=6;
                    }
                   else if(y==19) { // nedre kant
                        color+=board[y][x];
                        color+=board[y][x-1];
                        color+=board[y][x+1];
                        color+=board[y-1][x-1];
                        color+=board[y-1][x];
                        color+=board[y-1][x+1];
                        if (color>0)
                            color/=6;
                    }

                   else if(x==0) { // vänster kant
                        color+=board[y][x];
                        color+=board[y-1][x];
                        color+=board[y+1][x];
                        color+=board[y-1][x+1];
                        color+=board[y][x+1];
                        color+=board[y+1][x+1];
                        if (color>0)
                            color/=6;
                    }
                    else if (x==19) { // höger kant
                        color+=board[y][x];
                        color+=board[y-1][x];
                        color+=board[y+1][x];
                        color+=board[y-1][x-1];
                        color+=board[y][x-1];
                        color+=board[y+1][x-1];
                        if (color>0)
                            color/=6;
                    }
                    else { // resten
                    color +=board[x-1][y-1];
                    color +=board[x][y-1];
                    color +=board[x+1][y-1];

                    color +=board[x-1][y];
                    color +=board[x][y];
                    color +=board[x+1][y];

                    color += board[x-1][y+1];
                    color += board[x][y+1];
                    color += board[x+1][y+1];

                    if (color>0)
                    color/=9; }

                    tmpboard[x][y]=color;
                }
            }

            board = tmpboard;

            Key key;
            do{
                Thread.sleep(5);
                key = terminal.readInput();
            } while (key==null);


        }
    }
}
