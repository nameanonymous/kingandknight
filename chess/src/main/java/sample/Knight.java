package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.List;

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

//    KnightMove[] KnightArray = new KnightMove[8];

    List<KnightMove> moveableList2 =new ArrayList<KnightMove>();

    public void KnightChange(int x, int y){
            moveableList2.clear();
            moveableList2.add(new KnightMove(x-1, y-2));
            moveableList2.add(new KnightMove(x+1, y-2));
            moveableList2.add(new KnightMove(x-2, y-1));
            moveableList2.add(new KnightMove(x+2, y-1));
            moveableList2.add(new KnightMove(x-2, y+1));
            moveableList2.add(new KnightMove(x+2, y+1));
            moveableList2.add(new KnightMove(x-1, y+2));
            moveableList2.add(new KnightMove(x+1, y+2));
//        KnightArray[0] = new KnightMove(x-1, y-2);
//        KnightArray[1] = new KnightMove(x+1, y-2);
//        KnightArray[2] = new KnightMove(x-2, y-1);
//        KnightArray[3] = new KnightMove(x+2, y-1);
//        KnightArray[4] = new KnightMove(x-2, y+1);
//        KnightArray[5] = new KnightMove(x+2, y+1);
//        KnightArray[6] = new KnightMove(x-1, y+2);
//        KnightArray[7] = new KnightMove(x+1, y+2);





    }
}
