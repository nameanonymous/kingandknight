package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.*;
import sample.King;
import java.util.Scanner;
import java.util.Set;

public class Controller extends Application {

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

    public void SettheKing(int x, int y){
        ArrayforPanel[x][y].getChildren().add(kinginstance.getKing());
    }
    public void SettheKnight(int x, int y){
        ArrayforPanel[x][y].getChildren().add(knightinstance.getKnight());
    }
    EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
            System.out.println("Hello World");
            }
        kinginstance.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);

    }

