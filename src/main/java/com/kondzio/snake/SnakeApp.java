package com.kondzio.snake;

import javax.swing.*;
import java.util.ArrayList;

public class SnakeApp {
    public static void main(String[] args) throws InterruptedException {

        Board table = new Board(20, 20);
        ArrayList<Field> snakeTail = new ArrayList<Field>();
        snakeTail.add(table.getField(0,0));
        snakeTail.add(table.getField(0,1));
        snakeTail.add(table.getField(0,2));
        Field snakeHead = table.getField(0, 3);
        Snake snake = new Snake(table, snakeTail, snakeHead, Snake.Directrion.RIGHT);
        Window window = new Window(table);
        window.addKeyListener(new Controls(snake));

        while(true){
            window.repaint();
            snake.move();
            snake.paint();


            Thread.sleep(500);
        }

    }

}

