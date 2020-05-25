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
        public int getColumn() {
            return column;
        }

        public int getRow() {
            return row;
        }
    }

//    KnightMove[] KnightArray = new KnightMove[8];

    List<KnightMove> moveableList2 =new ArrayList<KnightMove>();

    public void KnightChange(int x, int y){
            moveableList2.clear();
        if(x-1 >= 0 && y-2 >= 0)//A
            moveableList2.add(new KnightMove(x-1, y-2));
        if(x-1 < 8 && y-2 >= 0)//B
            moveableList2.add(new KnightMove(x+1, y-2));
        if(x-2 >= 0 && y-1 >= 0)//C
            moveableList2.add(new KnightMove(x-2, y-1));
        if(x+2 < 8 && y-1 >= 0)//D
            moveableList2.add(new KnightMove(x+2, y-1));
        if(x-2 >= 0 && y+1 < 8)//E
            moveableList2.add(new KnightMove(x-2, y+1));
        if(x+2 <8  && y+1 < 8)//F
            moveableList2.add(new KnightMove(x+2, y+1));
        if(x-1 >= 0 && y+2 <8)//G
            moveableList2.add(new KnightMove(x-1, y+2));
        if(x+1 < 8 && y+2 < 8)//H
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
