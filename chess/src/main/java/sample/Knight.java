package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Knight {
    private ImageView knight = new ImageView(new Image(getClass().getResourceAsStream("/800px-Chess_nlt45.svg.png")));
    private int Row,Column;
    public Knight(){
        Row = 5;
        Column = 3;
        this.knight = knight;
    }

    public ImageView getKnight() {
        return knight;
    }

    public void setKnight(ImageView knight) {
        this.knight = knight;
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

    class KnightMove {
        public int column;
        public int row;
        public KnightMove(int i,int j ){
            this.column = i;
            this.row = j;
        }
    }
}
