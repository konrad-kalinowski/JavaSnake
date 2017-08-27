package com.kondzio.snake;

import javax.swing.*;
import java.util.ArrayList;

public class SnakeApp {
    public static void main(String[] args) throws InterruptedException {

        Board board = new Board(20, 20);
        ArrayList<Field> snakeTail = new ArrayList<Field>();
        snakeTail.add(board.getField(0,0));
        snakeTail.add(board.getField(0,1));
        snakeTail.add(board.getField(0,2));
        Field snakeHead = board.getField(0, 3);
        Snake snake = new Snake(board, snakeTail, snakeHead, Snake.Directrion.RIGHT);
        Window window = new Window(board);
        window.addKeyListener(new Controls(snake));

        while(true){
            window.repaint();
            board.generateApple();
            snake.move();
            if(snake.isColliding()){
                System.out.println("Game Over!");
                return;
            }
            snake.paint();


            Thread.sleep(500);
        }

    }

}

