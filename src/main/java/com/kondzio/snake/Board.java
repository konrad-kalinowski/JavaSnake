package com.kondzio.snake;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private Field[][] fields;

    public Board(int width, int height) {
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
}
