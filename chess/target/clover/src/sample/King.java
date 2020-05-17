/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package sample;

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

import java.util.ArrayList;
import java.util.List;

public class King {public static class __CLR4_4_14v4vkablpk49{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0044\u003a\u005c\u005c\u30c7\u30b9\u30af\u30c8\u30c3\u30d7\u005c\u005c\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0020\u0045\u006e\u0067\u0069\u006e\u0065\u0072\u0072\u0069\u006e\u0067\u005c\u005c\u0063\u0068\u0065\u0073\u0073\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1589752697422L,8589935092L,228,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private ImageView king = new ImageView(new Image(getClass().getResourceAsStream("/Chess_klt45.svg.png")));
    private int Row, Column;

    public King() {try{__CLR4_4_14v4vkablpk49.R.inc(175);
        __CLR4_4_14v4vkablpk49.R.inc(176);Row = 5;
        __CLR4_4_14v4vkablpk49.R.inc(177);Column = 2;
        __CLR4_4_14v4vkablpk49.R.inc(178);this.king = king;
    }finally{__CLR4_4_14v4vkablpk49.R.flushNeeded();}}

    public ImageView getKing() {try{__CLR4_4_14v4vkablpk49.R.inc(179);
        __CLR4_4_14v4vkablpk49.R.inc(180);return king;
    }finally{__CLR4_4_14v4vkablpk49.R.flushNeeded();}}

    public void setKing(ImageView king) {try{__CLR4_4_14v4vkablpk49.R.inc(181);
        __CLR4_4_14v4vkablpk49.R.inc(182);this.king = king;
    }finally{__CLR4_4_14v4vkablpk49.R.flushNeeded();}}

    public int getRow() {try{__CLR4_4_14v4vkablpk49.R.inc(183);
        __CLR4_4_14v4vkablpk49.R.inc(184);return Row;
    }finally{__CLR4_4_14v4vkablpk49.R.flushNeeded();}}

    public void setRow(int row) {try{__CLR4_4_14v4vkablpk49.R.inc(185);
        __CLR4_4_14v4vkablpk49.R.inc(186);Row = row;
    }finally{__CLR4_4_14v4vkablpk49.R.flushNeeded();}}

    public int getColumn() {try{__CLR4_4_14v4vkablpk49.R.inc(187);
        __CLR4_4_14v4vkablpk49.R.inc(188);return Column;
    }finally{__CLR4_4_14v4vkablpk49.R.flushNeeded();}}

    public void setColumn(int column) {try{__CLR4_4_14v4vkablpk49.R.inc(189);
        __CLR4_4_14v4vkablpk49.R.inc(190);Column = column;
    }finally{__CLR4_4_14v4vkablpk49.R.flushNeeded();}}

    class KingMove {
        public int column;
        public int row;
        public KingMove(int i,int j ){try{__CLR4_4_14v4vkablpk49.R.inc(191);
            __CLR4_4_14v4vkablpk49.R.inc(192);this.column = i;
            __CLR4_4_14v4vkablpk49.R.inc(193);this.row = j;
        }finally{__CLR4_4_14v4vkablpk49.R.flushNeeded();}}
    }

    List<KingMove> moveableList =new ArrayList<KingMove>();

    public void KingChange(int x, int y) {try{__CLR4_4_14v4vkablpk49.R.inc(194);
            __CLR4_4_14v4vkablpk49.R.inc(195);moveableList.clear();
        __CLR4_4_14v4vkablpk49.R.inc(196);if((((x-1 >= 0 && y-1 >= 0)&&(__CLR4_4_14v4vkablpk49.R.iget(197)!=0|true))||(__CLR4_4_14v4vkablpk49.R.iget(198)==0&false)))//A
            {__CLR4_4_14v4vkablpk49.R.inc(199);moveableList.add(new KingMove(x-1, y-1));
        }__CLR4_4_14v4vkablpk49.R.inc(200);if((((y-1 >=0)&&(__CLR4_4_14v4vkablpk49.R.iget(201)!=0|true))||(__CLR4_4_14v4vkablpk49.R.iget(202)==0&false)))//B
            {__CLR4_4_14v4vkablpk49.R.inc(203);moveableList.add(new KingMove(x, y-1));
        }__CLR4_4_14v4vkablpk49.R.inc(204);if((((x+1 < 8 && y-1 >= 0)&&(__CLR4_4_14v4vkablpk49.R.iget(205)!=0|true))||(__CLR4_4_14v4vkablpk49.R.iget(206)==0&false)))//C
            {__CLR4_4_14v4vkablpk49.R.inc(207);moveableList.add(new KingMove(x+1, y-1));
        }__CLR4_4_14v4vkablpk49.R.inc(208);if((((x-1 >= 0)&&(__CLR4_4_14v4vkablpk49.R.iget(209)!=0|true))||(__CLR4_4_14v4vkablpk49.R.iget(210)==0&false)))//D
            {__CLR4_4_14v4vkablpk49.R.inc(211);moveableList.add(new KingMove(x-1, y));
        }__CLR4_4_14v4vkablpk49.R.inc(212);if((((x+1 < 8)&&(__CLR4_4_14v4vkablpk49.R.iget(213)!=0|true))||(__CLR4_4_14v4vkablpk49.R.iget(214)==0&false)))//E
            {__CLR4_4_14v4vkablpk49.R.inc(215);moveableList.add(new KingMove(x+1, y));
        }__CLR4_4_14v4vkablpk49.R.inc(216);if((((x-1 >= 0  && y+1 < 8)&&(__CLR4_4_14v4vkablpk49.R.iget(217)!=0|true))||(__CLR4_4_14v4vkablpk49.R.iget(218)==0&false)))//F
            {__CLR4_4_14v4vkablpk49.R.inc(219);moveableList.add(new KingMove(x-1, y+1));
        }__CLR4_4_14v4vkablpk49.R.inc(220);if((((y+1 < 8)&&(__CLR4_4_14v4vkablpk49.R.iget(221)!=0|true))||(__CLR4_4_14v4vkablpk49.R.iget(222)==0&false)))//G
            {__CLR4_4_14v4vkablpk49.R.inc(223);moveableList.add(new KingMove(x, y+1));
        }__CLR4_4_14v4vkablpk49.R.inc(224);if((((x+1 < 8 && y+1 < 8)&&(__CLR4_4_14v4vkablpk49.R.iget(225)!=0|true))||(__CLR4_4_14v4vkablpk49.R.iget(226)==0&false)))//H
            {__CLR4_4_14v4vkablpk49.R.inc(227);moveableList.add(new KingMove(x+1, y+1));

//                if((x-1 >= 0 || x+1 < 8) && (y-1 >= 0 || y+1 < 8))
    }}finally{__CLR4_4_14v4vkablpk49.R.flushNeeded();}}




}
