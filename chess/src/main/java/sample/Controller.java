package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;
import result.GameResult;
import result.GameResultDao;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.Temporal;

@Slf4j
public class Controller {

    King kinginstance = new King();
    Knight knightinstance = new Knight();
    boolean isKingSelected;
    boolean isKnightSelected;
    int count = 0;
    private GameResultDao gameResultDao;
    @FXML
    private GridPane Panel8x8;
    private Pane[][] ArrayforPanel = new Pane[8][8];
    private String userName;
    private Instant beginGame;

    public void drawChessboard() {
        //Create the chessboard
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Pane panel = new Pane();
                int finalI = i;
                int finalJ = j;
                panel.setOnMouseClicked((event) -> {
                    pawnClicked(finalI, finalJ);
                });
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
    }

    public void initialize() {
        beginGame = Instant.now();
        drawChessboard();
        kinginstance.getKing().fitHeightProperty().bind(ArrayforPanel[0][0].widthProperty());
        kinginstance.getKing().fitWidthProperty().bind(ArrayforPanel[0][0].widthProperty());
        knightinstance.getKnight().fitWidthProperty().bind(ArrayforPanel[0][0].widthProperty());
        knightinstance.getKnight().fitHeightProperty().bind(ArrayforPanel[0][0].widthProperty());
        //Set the initial position
        SettheKing(kinginstance.getColumn(), kinginstance.getRow());
        System.out.println("KING: Column " + kinginstance.getColumn() + " , row " + kinginstance.getRow());
        SettheKnight(knightinstance.getColumn(), knightinstance.getRow());
        System.out.println("KNIGHT: Column " + knightinstance.getColumn() + " , row " + knightinstance.getRow());

    }

    private void pawnClicked(int i, int j) {
        System.out.println("Clicked " + i + " " + j);
        int prevkingcolumn = kinginstance.getColumn();
        int prevkingrow = kinginstance.getRow();
        int prevknightcolumn = knightinstance.getColumn();
        int prevknightrow = knightinstance.getRow();
        int oppcoulmn;
        int opprow;
        boolean continueable = false;

        if (prevkingcolumn == i && prevkingrow == j) {
            System.out.println("You clicked the prev king place!");
        }
        if (prevknightcolumn == i && prevknightrow == j) {
            System.out.println("You clicked the prev knight place!");
        }
        int kingcol = kinginstance.getColumn();
        System.out.println("NOW KING COLUMN " + kingcol);
        int kingrw = kinginstance.getRow();
        System.out.println("NOW KING ROW " + kingrw);
        kinginstance.KingChange(kingcol, kingrw);

        int knightcol = knightinstance.getColumn();
        System.out.println("NOW KNIGHT COLUMN " + knightcol);
        int knightrw = knightinstance.getRow();
        System.out.println("NOW KNIGHT ROW " + knightrw);
        knightinstance.KnightChange(knightcol, knightrw);

        for (int x = 0; x < 8; x++) {
            if (kingcol == i && kingrw == j) {
                System.out.println("King row and column: " + i + " " + j);
                System.out.println("King moveable column and row " + kinginstance.moveableList.get(x).column + " " + kinginstance.moveableList.get(x).row);
                isKingSelected = true;
                isKnightSelected = false;
                for (int y = 0; y < kinginstance.moveableList.size(); y++)
                    ArrayforPanel[kinginstance.moveableList.get(x).column][kinginstance.moveableList.get(x).row].setStyle("-fx-background-color:red");
            }
            if (isKingSelected == true) {
                if (kinginstance.moveableList.get(x).column == i && kinginstance.moveableList.get(x).row == j) {
                    {
                        KingDraw(i, j);
                        Checker(i, j);
                    }
                }
            } else if (knightcol == i && knightrw == j) {
                System.out.println("Knight Array column and row" + knightinstance.moveableList2.get(x).column + " " + knightinstance.moveableList2.get(x).row);
                isKnightSelected = true;
                isKingSelected = false;
                for (int y = 0; y < knightinstance.moveableList2.size(); y++)
                    ArrayforPanel[knightinstance.moveableList2.get(y).column][knightinstance.moveableList2.get(y).row].setStyle("-fx-background-color:red");
            }
            if (isKnightSelected == true) {
                if (knightinstance.moveableList2.get(x).column == i && knightinstance.moveableList2.get(x).row == j) {
                    {
                        KnightDraw(i, j);
                        Checker(i, j);
                    }
                }
            }
        }


    }

    public void Checker(int i, int j) {

        if (i == 6 && j == 7) {
            System.out.println("GOOOOOOOOOOOOOOOOOOOOOOAAAAAAAAAAAAAAAAAAAAAAAAAL!!!!!");
        }
    }

    public void KingDraw(int i, int j) {
        kinginstance.setRow(j);
        System.out.println("INSIDE OF KING ROW" + kinginstance.getRow());
        kinginstance.setColumn(i);
        System.out.println("INSIDE OF KING COLUMN" + kinginstance.getColumn());
        SettheKing(i, j);
        isKingSelected = false;
        count++;
        for (int z = 0; z < knightinstance.moveableList2.size(); z++) {
            if (i == knightinstance.moveableList2.get(z).column && j == knightinstance.moveableList2.get(z).row) {
                System.out.println("We found this game can continue. GO ahead!");
            }
        }
        for (int y = 0; y < kinginstance.moveableList.size(); y++) {
            i = kinginstance.moveableList.get(y).column;
            j = kinginstance.moveableList.get(y).row;
            if ((i + j) % 2 == 0) {
                ArrayforPanel[kinginstance.moveableList.get(y).column][kinginstance.moveableList.get(y).row].setStyle("-fx-background-color:#fce2c4");
            } else {
                ArrayforPanel[kinginstance.moveableList.get(y).column][kinginstance.moveableList.get(y).row].setStyle("-fx-background-color:orange");
            }
        }
    }

    public void KnightDraw(int i, int j) {

        knightinstance.setRow(j);
        System.out.println("INSIDE OF KNIGHT ROW" + knightinstance.getRow());
        knightinstance.setColumn(i);
        System.out.println("INSIDE OF KNIGHT COLUMN" + knightinstance.getColumn());
        SettheKnight(i, j);
        isKnightSelected = false;
        count++;
        for (int z = 0; z < kinginstance.moveableList.size(); z++) {
            if (i == kinginstance.moveableList.get(z).column && j == kinginstance.moveableList.get(z).row) {
                System.out.println("We found this game can continue. GO ahead!");
            }
        }


        for (int y = 0; y < knightinstance.moveableList2.size(); y++) {
            i = knightinstance.moveableList2.get(y).column;
            j = knightinstance.moveableList2.get(y).row;
            if ((i + j) % 2 == 0) {
                ArrayforPanel[knightinstance.moveableList2.get(y).column][knightinstance.moveableList2.get(y).row].setStyle("-fx-background-color:#fce2c4");
            } else {
                ArrayforPanel[knightinstance.moveableList2.get(y).column][knightinstance.moveableList2.get(y).row].setStyle("-fx-background-color:orange");
            }
        }
    }


    public void SettheKing(int x, int y) {
        ArrayforPanel[x][y].getChildren().add(kinginstance.getKing());
    }

    public void SettheKnight(int x, int y) {
        ArrayforPanel[x][y].getChildren().add(knightinstance.getKnight());
    }
    public void start2(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/result.fxml"));
        primaryStage.setTitle("KING AND KNIGHT");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    public void initdata(String userName) {
        this.userName = userName;
    }

    private GameResult getResult() {

        GameResult result = GameResult.builder()
                .player(userName)
                .duration(Duration.between(beginGame, Instant.now()))
                .counts(count)
                .build();
        return result;
    }
    public void finishGame(ActionEvent actionEvent) throws IOException {
        int a = kinginstance.getColumn();
        int b = kinginstance.getRow();
        int c = knightinstance.getColumn();
        int d = knightinstance.getRow();

        if ((a == 6 && b == 7)||(c == 6 && d == 7)) {
            gameResultDao.persist(getResult());
            Parent root = FXMLLoader.load(getClass().getResource("results.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
            log.info("Finished game, loading Top Ten scene.");
        }
    }
}

