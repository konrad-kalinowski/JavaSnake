package com.kondzio.snake;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controls implements KeyListener {
    private Snake snake;

    public Controls(Snake snake){

        this.snake = snake;
    }
    public void keyTyped(KeyEvent e) {
        Snake.Directrion directrion;
        System.out.println("Pressed Key:" + e.getKeyChar());
        switch (e.getKeyChar()) {
            case 'w':
                directrion = Snake.Directrion.UP;
                break;
            case 's':
                directrion = Snake.Directrion.DOWN;
                break;
            case 'a':
                directrion = Snake.Directrion.LEFT;
                break;
            case 'd':
                directrion = Snake.Directrion.RIGHT;
                break;
            default:
                directrion = null;

        }
        snake.setDirection(directrion);


    }

    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {

    }
}
