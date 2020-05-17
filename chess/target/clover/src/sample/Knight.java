/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Knight {public static class __CLR4_4_16c6ckablpk4s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0044\u003a\u005c\u005c\u30c7\u30b9\u30af\u30c8\u30c3\u30d7\u005c\u005c\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0020\u0045\u006e\u0067\u0069\u006e\u0065\u0072\u0072\u0069\u006e\u0067\u005c\u005c\u0063\u0068\u0065\u0073\u0073\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1589752697422L,8589935092L,257,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private ImageView knight = new ImageView(new Image(getClass().getResourceAsStream("/800px-Chess_nlt45.svg.png")));
    private int Row,Column;
    public Knight(){try{__CLR4_4_16c6ckablpk4s.R.inc(228);
        __CLR4_4_16c6ckablpk4s.R.inc(229);Row = 5;
        __CLR4_4_16c6ckablpk4s.R.inc(230);Column = 3;
        __CLR4_4_16c6ckablpk4s.R.inc(231);this.knight = knight;
    }finally{__CLR4_4_16c6ckablpk4s.R.flushNeeded();}}

    public ImageView getKnight() {try{__CLR4_4_16c6ckablpk4s.R.inc(232);
        __CLR4_4_16c6ckablpk4s.R.inc(233);return knight;
    }finally{__CLR4_4_16c6ckablpk4s.R.flushNeeded();}}

    public void setKnight(ImageView knight) {try{__CLR4_4_16c6ckablpk4s.R.inc(234);
        __CLR4_4_16c6ckablpk4s.R.inc(235);this.knight = knight;
    }finally{__CLR4_4_16c6ckablpk4s.R.flushNeeded();}}

    public int getRow() {try{__CLR4_4_16c6ckablpk4s.R.inc(236);
        __CLR4_4_16c6ckablpk4s.R.inc(237);return Row;
    }finally{__CLR4_4_16c6ckablpk4s.R.flushNeeded();}}

    public void setRow(int row) {try{__CLR4_4_16c6ckablpk4s.R.inc(238);
        __CLR4_4_16c6ckablpk4s.R.inc(239);Row = row;
    }finally{__CLR4_4_16c6ckablpk4s.R.flushNeeded();}}

    public int getColumn() {try{__CLR4_4_16c6ckablpk4s.R.inc(240);
        __CLR4_4_16c6ckablpk4s.R.inc(241);return Column;
    }finally{__CLR4_4_16c6ckablpk4s.R.flushNeeded();}}

    public void setColumn(int column) {try{__CLR4_4_16c6ckablpk4s.R.inc(242);
        __CLR4_4_16c6ckablpk4s.R.inc(243);Column = column;
    }finally{__CLR4_4_16c6ckablpk4s.R.flushNeeded();}}

    class KnightMove {
        public int column;
        public int row;
        public KnightMove(int i,int j ){try{__CLR4_4_16c6ckablpk4s.R.inc(244);
            __CLR4_4_16c6ckablpk4s.R.inc(245);this.column = i;
            __CLR4_4_16c6ckablpk4s.R.inc(246);this.row = j;
        }finally{__CLR4_4_16c6ckablpk4s.R.flushNeeded();}}
    }

//    KnightMove[] KnightArray = new KnightMove[8];

    List<KnightMove> moveableList2 =new ArrayList<KnightMove>();

    public void KnightChange(int x, int y){try{__CLR4_4_16c6ckablpk4s.R.inc(247);
            __CLR4_4_16c6ckablpk4s.R.inc(248);moveableList2.clear();
            __CLR4_4_16c6ckablpk4s.R.inc(249);moveableList2.add(new KnightMove(x-1, y-2));
            __CLR4_4_16c6ckablpk4s.R.inc(250);moveableList2.add(new KnightMove(x+1, y-2));
            __CLR4_4_16c6ckablpk4s.R.inc(251);moveableList2.add(new KnightMove(x-2, y-1));
            __CLR4_4_16c6ckablpk4s.R.inc(252);moveableList2.add(new KnightMove(x+2, y-1));
            __CLR4_4_16c6ckablpk4s.R.inc(253);moveableList2.add(new KnightMove(x-2, y+1));
            __CLR4_4_16c6ckablpk4s.R.inc(254);moveableList2.add(new KnightMove(x+2, y+1));
            __CLR4_4_16c6ckablpk4s.R.inc(255);moveableList2.add(new KnightMove(x-1, y+2));
            __CLR4_4_16c6ckablpk4s.R.inc(256);moveableList2.add(new KnightMove(x+1, y+2));
//        KnightArray[0] = new KnightMove(x-1, y-2);
//        KnightArray[1] = new KnightMove(x+1, y-2);
//        KnightArray[2] = new KnightMove(x-2, y-1);
//        KnightArray[3] = new KnightMove(x+2, y-1);
//        KnightArray[4] = new KnightMove(x-2, y+1);
//        KnightArray[5] = new KnightMove(x+2, y+1);
//        KnightArray[6] = new KnightMove(x-1, y+2);
//        KnightArray[7] = new KnightMove(x+1, y+2);





    }finally{__CLR4_4_16c6ckablpk4s.R.flushNeeded();}}
}
