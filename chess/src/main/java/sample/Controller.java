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

import java.time.Duration;
import java.time.Instant;

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
    private boolean finishGamecondition;

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
        int kingcol = kinginstance.getColumn();
        int kingrw = kinginstance.getRow();
        kinginstance.KingChange(kingcol, kingrw);

        int knightcol = knightinstance.getColumn();
        int knightrw = knightinstance.getRow();
        knightinstance.KnightChange(knightcol, knightrw);

        for (int x = 0; x < 8; x++) {
            if (kingcol == i && kingrw == j) {
                isKingSelected = true;
                isKnightSelected = false;
                for (int y = 0; y < kinginstance.moveableList.size(); y++)
                    ArrayforPanel[kinginstance.moveableList.get(x).column][kinginstance.moveableList.get(x).row].setStyle("-fx-background-color:red");
            }
            if (isKingSelected == true) {
                if (kinginstance.moveableList.get(x).column == i && kinginstance.moveableList.get(x).row == j) {
                    {
                        KingDraw(i, j);
                        KingChecker(i, j);
                    }
                }
            } else if (knightcol == i && knightrw == j) {
                isKnightSelected = true;
                isKingSelected = false;
                for (int y = 0; y < knightinstance.moveableList2.size(); y++)
                    ArrayforPanel[knightinstance.moveableList2.get(y).column][knightinstance.moveableList2.get(y).row].setStyle("-fx-background-color:red");
            }
            if (isKnightSelected == true) {
                if (knightinstance.moveableList2.get(x).column == i && knightinstance.moveableList2.get(x).row == j) {
                    {
                        KnightDraw(i, j);
                        KnightChecker(i, j);
                    }
                }
            }
        }


    }

    public void KingChecker(int i, int j) {
        log.info("CHECKER METHOD CALLED");
        Knight.KnightMove findout = knightinstance.moveableList2.stream()
                .filter(checkval -> checkval.getColumn() == i)
                .filter(checkval -> checkval.getRow() == j)
                .findAny()
                .orElse(null);
        System.out.println(findout);
        System.out.println(kinginstance.moveableList.get(7).column + " " + kinginstance.moveableList.get(7).row);
        kinginstance.KingChange(i,j);
        System.out.println(kinginstance.moveableList.get(7).column + " " + kinginstance.moveableList.get(7).row);
        int knightcol = knightinstance.getColumn();
        int knightrw = knightinstance.getRow();
        King.KingMove findrange = kinginstance.moveableList.stream()
                .filter(checkval -> checkval.getColumn() == knightcol)
                .filter(checkval -> checkval.getRow() == knightrw)
                .findAny()
                .orElse(null);
        System.out.println(findrange);
        //131-135 is for checking for king, from 120 to 125 it will check is the king pawn is inside the range of knight.
        //If not, we have to check for king is there any knight pawn inside the king range.
        //So this lamda expression will check are there any "KNIGHT" pawn in the king range. But it doen't works correctly. WHY???

        if (i == 6 && j == 7) {
            System.out.println("GOOOOOOOOOOOOOOOOOOOOOOAAAAAAAAAAAAAAAAAAAAAAAAAL!!!!!");
            finishGamecondition = true;
        }

    }
    public void KnightChecker(int i, int j) {
        log.info("CHECKER METHOD CALLED");
        King.KingMove findout = kinginstance.moveableList.stream()
                .filter(checkval -> checkval.getColumn() == i)
                .filter(checkval -> checkval.getRow() == j)
                .findAny()
                .orElse(null);
        knightinstance.KnightChange(i,j);

        Knight.KnightMove findrange = knightinstance.moveableList2.stream()
                .filter(checkval -> checkval.getColumn() == kinginstance.getColumn())
                .filter(checkval -> checkval.getRow() == kinginstance.getRow())
                .findAny()
                .orElse(null);
        System.out.println(findrange);
        //This will also have the same problem as KingChecker method...but it works lol

        if (i == 6 && j == 7) {
            System.out.println("GOOOOOOOOOOOOOOOOOOOOOOAAAAAAAAAAAAAAAAAAAAAAAAAL!!!!!");
            finishGamecondition = true;
        }

    }

    public void KingDraw(int i, int j) {
        kinginstance.setRow(j);
        kinginstance.setColumn(i);
        SettheKing(i, j);
        isKingSelected = false;
        count++;
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
        knightinstance.setColumn(i);
        SettheKnight(i, j);
        isKnightSelected = false;
        count++;
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

    public void start2(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/results.fxml"));
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

    public void finishGame(ActionEvent actionEvent) throws Exception {
        if (finishGamecondition == true) {
            gameResultDao.persist(getResult());
            Parent root = FXMLLoader.load(getClass().getResource("/results.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
            log.info("Finished game, loading Top Ten scene.");
        } else {
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            tryagain(stage);
        }

    }

    public void tryagain(Stage tryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/tryagain.fxml"));
        tryStage.setTitle("KING AND KNIGHT");
        tryStage.setResizable(false);
        tryStage.setScene(new Scene(root));
        tryStage.show();
    }
}



