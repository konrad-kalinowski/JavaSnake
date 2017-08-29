package com.kondzio.snake;


import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Window extends JFrame {

    private final JLabel scoreLabel;
    private Board board;
    private final JPanel boardPanel;


    public Window(Board board) {
        this.board = board;
        setTitle("Snake    Wynik: ");
        setSize(600, 600);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        boardPanel = new JPanel();
        boardPanel.setLayout(new GridLayout(20, 20, 0, 0));
        add(boardPanel);
        List<Field> fields = board.fields();
        for (Field field : fields) {
            boardPanel.add(field);
        }


        scoreLabel = new JLabel("ddd");
        add(new JPanel().add(scoreLabel));
        getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));



    }

    public void updateScore(int score, long playTime) {
        scoreLabel.setText("Score: " + score + ", play time: " + playTime + "seconds.");
    }

}