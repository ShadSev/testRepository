/**
 *
 */
package com.company;

import com.googlecode.lanterna.*;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.TerminalSize;
import java.nio.charset.Charset;



public class Ex7_4 {
    public static void main(String[] args) {
        Terminal terminal = TerminalFacade.createTerminal(System.in, System.out,
                Charset.forName("UTF8"));

        terminal.enterPrivateMode();
        terminal.applyForegroundColor(Terminal.Color.GREEN);

        Boolean[][] board = new Boolean[8][8];


        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                    if (i % 2 == 0 && j % 2 == 0){
                        board[i][j]= true;
                    }
                    else if (i%2!=0 && j%2!=0) {
                        board[i][j]=true;
                    }
                    else {
                        board[i][j]=false; }

            }
            }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                    if(board[i][j])
                System.out.print("O");
                else
                     System.out.print("X");

            }
            System.out.println();
        }
            for (int u = 0; u < 8; u++) {
                for (int ux = 0; ux < 8; ux++) {
                    if (u % 2 == 0 && ux % 2 == 0) {
                        terminal.moveCursor(u, ux);
                        terminal.putCharacter('\u263a');
                    } else if (u % 2 != 0 && ux % 2 != 0) {
                        terminal.moveCursor(u, ux);
                        terminal.putCharacter('\u263a');
                    } else {
                        terminal.moveCursor(ux, u);
                        terminal.putCharacter('X');
                    }
                }
            }
      }
    }
