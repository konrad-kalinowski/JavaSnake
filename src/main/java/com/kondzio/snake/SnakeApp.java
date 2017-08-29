package com.kondzio.snake;

import javax.swing.*;
import java.util.ArrayList;

public class SnakeApp {
    public static void main(String[] args) throws InterruptedException {

        UserScore score = new UserScore();
        Board board = new Board(20, 20);
        ArrayList<Field> snakeTail = new ArrayList<Field>();
        snakeTail.add(board.getField(0,0));
        snakeTail.add(board.getField(0,1));
        snakeTail.add(board.getField(0,2));
        Field snakeHead = board.getField(0, 3);
        Snake snake = new Snake(board, snakeTail, snakeHead, Snake.Directrion.RIGHT, score );
        Window window = new Window(board);

        window.addKeyListener(new Controls(snake));
        while(true){
            board.generateApple();
            snake.move();
            if(snake.isColliding()){
                System.out.println("Game Over! \n Wynik: "+ score.getScore() +" Czas trwania rozgrywki: "+ score.playTime());
                return;
            }
            window.updateScore(score.getScore(), score.playTime());
            snake.paint();
            window.revalidate();
            Thread.sleep(score.getDificultyLevel());
        }

    }

}

