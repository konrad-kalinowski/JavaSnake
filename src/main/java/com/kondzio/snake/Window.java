package com.kondzio.snake;


import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Window extends JFrame {

    private Board board;

    public Window(Board board) {
        this.board = board;
        setTitle("Snake");
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new GridLayout(20, 20, 0, 0));
    }

    public void repaint() {
        List<Field> fields = board.fields();
        for (Field field : fields) {
            add(field);
        }
    }
}
