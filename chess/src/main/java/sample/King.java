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

public class King{
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



}
