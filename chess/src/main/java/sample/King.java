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
        public KingMove(int i,int j ){
            this.column = i;
            this.row = j;
        }
    }

    KingMove[] KingArray = new KingMove[8];

    public void KingChange(int x, int y) {

//        KingMove kingmoving = new KingMove();
//        kingmoving.column = x - 1;
//        kingmoving.row = y - 1;
//        KingArray[0] = kingmoving;
//        KingMove kingmoving2 = new KingMove();
//        kingmoving2.column = x;
//        kingmoving2.row = y - 1;
//        KingArray[1] = kingmoving2;
//        KingMove kingmoving3 = new KingMove();
//        kingmoving.column = x + 1;
//        kingmoving.row = y - 1;
//        KingArray[2] = kingmoving3;
//        KingMove kingmoving4 = new KingMove();
//        kingmoving4.column = x - 1;
//        kingmoving4.row = y;
//        KingArray[3] = kingmoving4;
//        KingMove kingmoving5 = new KingMove();
//        kingmoving5.column = x+1;
//        kingmoving5.row = y;
//        KingArray[4] = kingmoving5;
//        KingMove kingmoving6 = new KingMove();
//        kingmoving6.column = x-1;
//        kingmoving6.row = y+1;
//        KingArray[5] = kingmoving6;
//        KingMove kingmoving7 = new KingMove();
//        kingmoving7.column = x;
//        kingmoving7.row = y+1;
//        KingArray[6] = kingmoving7;
//        KingMove kingmoving8 = new KingMove();
//        kingmoving8.column = x+1;
//        kingmoving8.row = y+1;
//        KingArray[7] = kingmoving8;
    if( x-1 >= 0 && x+1 < 8 && y-1 >= 0 && y+1 < 8 ){
        KingArray[0] = new KingMove(x-1, y-1);}
    if( x-1 >= 0 && x+1 < 8 && y-1 >= 0 && y+1 < 8 ){
        KingArray[1] = new KingMove(x, y-1);}
    if( x-1 >= 0 && x+1 < 8 && y-1 >= 0 && y+1 < 8 ){
        KingArray[2] = new KingMove(x+1, y-1);}
    if( x-1 >= 0 && x+1 < 8 && y-1 >= 0 && y+1 < 8 ){
        KingArray[3] = new KingMove(x-1, y);}
    if( x-1 >= 0 && x+1 < 8 && y-1 >= 0 && y+1 < 8 ){
        KingArray[4] = new KingMove(x+1, y);}
    if( x-1 >= 0 && x+1 < 8 && y-1 >= 0 && y+1 < 8 ){
        KingArray[5] = new KingMove(x-1, y+1);}
    if( x-1 >= 0 && x+1 < 8 && y-1 >= 0 && y+1 < 8 ){
        KingArray[6] = new KingMove(x, y+1);}
    if( x-1 >= 0 && x+1 < 8 && y-1 >= 0 && y+1 < 8 ){
        KingArray[7] = new KingMove(x+1, y+1);}
    }
}
