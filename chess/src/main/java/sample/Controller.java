package sample;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class Controller {
    private ImageView king = new ImageView(new Image(getClass().getResourceAsStream("/Chess_klt45.svg.png")));
    private ImageView kngiht = new ImageView(new Image(getClass().getResourceAsStream("/800px-Chess_nlt45.svg.png")));
    @FXML
    private GridPane Panel8x8;
    private Pane[][] ArrayforPanel = new Pane[8][8];

    public void setKing(ImageView king) {
        this.king = king;
    }

    public void initialize() {
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
        king.fitWidthProperty().bind(ArrayforPanel[0][0].widthProperty());
        king.fitHeightProperty().bind(ArrayforPanel[0][0].widthProperty());
        ArrayforPanel[2][3].getChildren().add(king);
    }


}

