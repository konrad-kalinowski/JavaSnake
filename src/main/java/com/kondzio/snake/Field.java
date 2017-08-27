package com.kondzio.snake;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Field extends JPanel {
    private int xPos;
    private int yPos;
    private State state;
    public enum State{

        SNAKE, DOT, EMPTY;
    }
    public Field(int x,int y){
        this.xPos = x;
        this.yPos = y;
        state = State.EMPTY;
        setBackground(Color.white);
        setBorder(new LineBorder(Color.BLACK));
    }
    public Field (int x, int y, State state){
        this.state = state;
        this.xPos = x;
        this.yPos = y;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }
}
