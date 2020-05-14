package sample;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class Controller {

    King kinginstance = new King();
    Knight knightinstance = new Knight();
    boolean isKingSelected;
    boolean isKnightSelected;
    int count = 0;
    @FXML
    private GridPane Panel8x8;
    private Pane[][] ArrayforPanel = new Pane[8][8];

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
        //Create the Chessboard.
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                Pane panel = new Pane();
//                int finalI = i;
//                int finalJ = j;
//                panel.setOnMouseClicked((event) -> {
//                    pawnClicked(finalI, finalJ);
//                });
//                Panel8x8.add(panel, i, j);
//
//                ArrayforPanel[i][j] = panel;
//                if ((i + j) % 2 == 0) {
//                    panel.setStyle("-fx-background-color:#fce2c4");
//                } else {
//                    panel.setStyle("-fx-background-color:orange");
//                }
//                if (i == 6 && j == 7) {
//                    panel.setStyle("-fx-background-color:red");
//                }
//            }
//        }
        //Fit the picture to each panel
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
                System.out.println("King moveable column and row" + kinginstance.KingArray[x].column + " " + kinginstance.KingArray[x].row);
                isKingSelected = true;
                isKnightSelected = false;
                for (int y = 0; y < 8; y++)
                    ArrayforPanel[kinginstance.KingArray[y].column][kinginstance.KingArray[y].row].setStyle("-fx-background-color:red");
            }
            if (isKingSelected == true) {
                if (kinginstance.KingArray[x].column == i && kinginstance.KingArray[x].row == j) {
                    {
                        KingDraw(i, j);
                        Checker(i, j);
                    }
                }
            } else if (knightcol == i && knightrw == j) {
                System.out.println("Knight Array column and row" + knightinstance.KnightArray[x].column + " " + knightinstance.KnightArray[x].row);
                isKnightSelected = true;
                isKingSelected = false;
                for (int y = 0; y < 8; y++)
                    ArrayforPanel[knightinstance.KnightArray[y].column][knightinstance.KnightArray[y].row].setStyle("-fx-background-color:red");
            }
            if (isKnightSelected == true) {
                if (knightinstance.KnightArray[x].column == i && knightinstance.KnightArray[x].row == j) {
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
        for (int z = 0; z < 8; z++) {
            if (i == knightinstance.KnightArray[z].column && j == knightinstance.KnightArray[z].row) {
                System.out.println("We found this game can continue. GO ahead!");
            }
        }
        for (int y = 0; y < 8; y++) {
            i = kinginstance.KingArray[y].column;
            j = kinginstance.KingArray[y].row;
            if ((i + j) % 2 == 0) {
                ArrayforPanel[kinginstance.KingArray[y].column][kinginstance.KingArray[y].row].setStyle("-fx-background-color:#fce2c4");
            } else {
                ArrayforPanel[kinginstance.KingArray[y].column][kinginstance.KingArray[y].row].setStyle("-fx-background-color:orange");
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
        for (int z = 0; z < 8; z++) {
            if (i == kinginstance.KingArray[z].column && j == kinginstance.KingArray[z].row) {
                System.out.println("We found this game can continue. GO ahead!");
            }
        }


        for (int y = 0; y < 8; y++) {
            i = knightinstance.KnightArray[y].column;
            j = knightinstance.KnightArray[y].row;
            if ((i + j) % 2 == 0) {
                ArrayforPanel[knightinstance.KnightArray[y].column][knightinstance.KnightArray[y].row].setStyle("-fx-background-color:#fce2c4");
            } else {
                ArrayforPanel[knightinstance.KnightArray[y].column][knightinstance.KnightArray[y].row].setStyle("-fx-background-color:orange");
            }
        }
    }


    public void SettheKing(int x, int y) {
        ArrayforPanel[x][y].getChildren().add(kinginstance.getKing());
    }

    public void SettheKnight(int x, int y) {
        ArrayforPanel[x][y].getChildren().add(knightinstance.getKnight());
    }


}

