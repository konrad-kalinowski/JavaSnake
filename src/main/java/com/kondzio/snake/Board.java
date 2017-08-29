package com.kondzio.snake;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.awt.FontMetrics;

public class Board {
    private final int width;
    private final int height;
    private Field[][] fields;
    private Field apple;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;

        fields = new Field[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                fields[i][j] = new Field(i, j);
            }
        }

    }

    public List<Field> fields() {
        ArrayList<Field> fieldsList = new ArrayList<Field>();
        for (int i = 0; i < this.fields.length; i++) {
            for (int j = 0; j < this.fields[i].length; j++) {
                fieldsList.add(this.fields[i][j]);
            }
        }
        return fieldsList;
    }

    public Field getField(int x, int y) {
        System.out.println("Getting field x= " + x + " y= " + y);
        return fields[x][y];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void generateApple() {
        if (apple == null) {

            Random r = new Random();
            int x = r.nextInt(getWidth());
            int y = r.nextInt(getHeight());
            apple = getField(x, y);
            apple.setBackground(Color.RED);
            System.out.println("Next apple coordinates: (" + x + ", " + y + ")");
        }

    }

    public Field getApple() {
        return apple;
    }


    public void clearApple() {
        apple = null;
        System.out.println("Cleared apple");
    }
}
