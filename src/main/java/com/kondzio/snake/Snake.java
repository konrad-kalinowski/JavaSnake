package com.kondzio.snake;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Snake {
    public enum Directrion {
        UP, DOWN, LEFT, RIGHT;
    }

    private Board board;
    private List<Field> tail;
    private Field head;
    private Directrion directrion;

    public Snake(Board board, List<Field> tail, Field head, Directrion directrion) {
        this.board = board;
        this.tail = tail;
        this.head = head;
        this.directrion = directrion;

    }

    public void paint() {
        for (Field field : tail) {
            field.setBackground(Color.BLUE);

        }
        head.setBackground(Color.CYAN);
    }

    public void move() {
        int newHeadX = 0;
        int newHeadY = 0;
        switch (directrion) {
            case UP:
                newHeadX = head.getxPos() - 1;
                newHeadY = head.getyPos();
                break;
            case DOWN:
                newHeadX = head.getxPos() + 1;
                newHeadY = head.getyPos();
                break;
            case LEFT:
                newHeadX = head.getxPos();
                newHeadY = head.getyPos() - 1;

                break;
            case RIGHT:
                newHeadX = head.getxPos();
                newHeadY = head.getyPos() + 1;
                break;
        }
        if (newHeadX >= board.getHeight()) {
            newHeadX = 0;
        }
        if (newHeadX < 0) {
            newHeadX = board.getHeight() - 1;
        }
        if (newHeadY >= board.getWidth()) {
            newHeadY = 0;
        }
        if (newHeadY < 0) {
            newHeadY = board.getWidth() - 1;
        }
        tail.add(head);
        tail.get(0).setBackground(Color.WHITE);
        tail.remove(0);
        head = board.getField(newHeadX, newHeadY);
    }

    public void setDirection(Directrion direction) {
        if (direction != null) {
            this.directrion = direction;

        }
    }


}