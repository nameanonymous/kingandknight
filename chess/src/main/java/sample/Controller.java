package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.effect.Light;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.*;
import sample.King;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Controller {

    @FXML
    private GridPane Panel8x8;
    private Pane[][] ArrayforPanel = new Pane[8][8];
    King kinginstance = new King();
    Knight knightinstance = new Knight();
    public void initialize() {
        //Create the Chessboard.
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Pane panel = new Pane();
                int finalI = i;
                int finalJ = j;
                panel.setOnMouseClicked((event) -> {pawnClicked(finalI, finalJ);});
                Panel8x8.add(panel, i, j);

                ArrayforPanel[i][j] = panel;
                if ((i + j) % 2 == 0) {
                    panel.setStyle("-fx-background-color:#fce2c4");
                } else {
                    panel.setStyle("-fx-background-color:orange");
                }
                if (i == 6 && j == 7) {
                    panel.setStyle("-fx-background-color:red");
                }
            }
        }
        //Fit the picture to each panel
        kinginstance.getKing().fitHeightProperty().bind(ArrayforPanel[0][0].widthProperty());
        kinginstance.getKing().fitWidthProperty().bind(ArrayforPanel[0][0].widthProperty());
        knightinstance.getKnight().fitWidthProperty().bind(ArrayforPanel[0][0].widthProperty());
        knightinstance.getKnight().fitHeightProperty().bind(ArrayforPanel[0][0].widthProperty());
        //Set the initial position
        SettheKing(kinginstance.getColumn(),kinginstance.getRow());
        System.out.println("KING: Column " + kinginstance.getColumn() + " , row "  + kinginstance.getRow());
        SettheKnight(knightinstance.getColumn(),knightinstance.getRow());
        System.out.println("KNIGHT: Column " + knightinstance.getColumn() + " , row "  + knightinstance.getRow());

    }

    private void pawnClicked(int i,int j) {
        System.out.println("Clicked " + i + " " + j);
        int initialkingcolumn = kinginstance.getColumn();
        int initialkingrow = kinginstance.getRow();
        int initialknightcolumn = knightinstance.getColumn();
        int initialknightrow = knightinstance.getRow();

        if(initialkingcolumn == i && initialkingrow == j)
        {
            System.out.println("You clicked the initial king place!");
        }
        if(initialknightcolumn == i && initialknightrow == j)
        {
            System.out.println("You clicked the initial knight place!");
        }
        int kingcol = kinginstance.getColumn();
        System.out.println("NOW KING COLUMN " + kingcol);
        int kingrw = kinginstance.getRow();
        System.out.println("NOW KING ROW " + kingrw);
        kinginstance.KingChange(kingcol,kingrw);

        for(int x = 0; x < 8; x++)
            {
                System.out.println("King Array column and row" + kinginstance.KingArray[x].column + " " + kinginstance.KingArray[x].row );
                if(kinginstance.KingArray[x].column == i && kinginstance.KingArray[x].row == j){
                    {
                        kinginstance.setRow(j);
                        System.out.println("INSIDE IF KING ROW" + kinginstance.getRow());
                        kinginstance.setColumn(i);
                        System.out.println("INSIDE IF KING COLUMN" + kinginstance.getColumn());
                        SettheKing(i,j);
                    }
                }

        }


    }



    public void SettheKing(int x, int y){
        ArrayforPanel[x][y].getChildren().add(kinginstance.getKing());
    }
    public void SettheKnight(int x, int y){
        ArrayforPanel[x][y].getChildren().add(knightinstance.getKnight());
    }

    

}

