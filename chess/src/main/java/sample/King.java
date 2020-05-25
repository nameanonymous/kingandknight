package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.*;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.lang.*;
public class King {
    private ImageView king = new ImageView(new Image(getClass().getResourceAsStream("/Chess_klt45.svg.png")));
    private int Row, Column;

    public King() {
        Row = 5;
        Column = 2;
        this.king = king;
    }

    public ImageView getKing() {
        return king;
    }

    public void setKing(ImageView king) {
        this.king = king;
    }

    public int getRow() {
        return Row;
    }

    public void setRow(int row) {
        Row = row;
    }

    public int getColumn() {
        return Column;
    }

    public void setColumn(int column) {
        Column = column;
    }

    class KingMove {

        public int column;
        public int row;

        public KingMove(int i, int j ){
            this.column = i;
            this.row = j;
        }

        public int getColumn() {
            return column;
        }
        public int getRow() {
            return column;
        }
    }

    List<KingMove> moveableList =new ArrayList<KingMove>();

    public void KingChange(int x, int y) {
            moveableList.clear();
        if(x-1 >= 0 && y-1 >= 0)//A
            moveableList.add(new KingMove(x-1, y-1));
        if(y-1 >=0)//B
            moveableList.add(new KingMove(x, y-1));
        if(x+1 < 8 && y-1 >= 0)//C
            moveableList.add(new KingMove(x+1, y-1));
        if(x-1 >= 0)//D
            moveableList.add(new KingMove(x-1, y));
        if(x+1 < 8)//E
            moveableList.add(new KingMove(x+1, y));
        if(x-1 >= 0  && y+1 < 8)//F
            moveableList.add(new KingMove(x-1, y+1));
        if(y+1 < 8)//G
            moveableList.add(new KingMove(x, y+1));
        if(x+1 < 8 && y+1 < 8)//H
            moveableList.add(new KingMove(x+1, y+1));

//                if((x-1 >= 0 || x+1 < 8) && (y-1 >= 0 || y+1 < 8))
    }



}
