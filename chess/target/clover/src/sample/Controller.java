/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Controller {public static class __CLR4_4_1aakablpk36{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0044\u003a\u005c\u005c\u30c7\u30b9\u30af\u30c8\u30c3\u30d7\u005c\u005c\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0020\u0045\u006e\u0067\u0069\u006e\u0065\u0072\u0072\u0069\u006e\u0067\u005c\u005c\u0063\u0068\u0065\u0073\u0073\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1589752697422L,8589935092L,175,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    King kinginstance = new King();
    Knight knightinstance = new Knight();
    boolean isKingSelected;
    boolean isKnightSelected;
    int count = 0;
    @FXML
    private GridPane Panel8x8;
    private Pane[][] ArrayforPanel = new Pane[8][8];

    public void drawChessboard() {try{__CLR4_4_1aakablpk36.R.inc(10);
        //Create the chessboard
        __CLR4_4_1aakablpk36.R.inc(11);for (int i = 0; (((i < 8)&&(__CLR4_4_1aakablpk36.R.iget(12)!=0|true))||(__CLR4_4_1aakablpk36.R.iget(13)==0&false)); i++) {{
            __CLR4_4_1aakablpk36.R.inc(14);for (int j = 0; (((j < 8)&&(__CLR4_4_1aakablpk36.R.iget(15)!=0|true))||(__CLR4_4_1aakablpk36.R.iget(16)==0&false)); j++) {{
                __CLR4_4_1aakablpk36.R.inc(17);Pane panel = new Pane();
                __CLR4_4_1aakablpk36.R.inc(18);int finalI = i;
                __CLR4_4_1aakablpk36.R.inc(19);int finalJ = j;
                __CLR4_4_1aakablpk36.R.inc(20);panel.setOnMouseClicked((event) -> {
                    __CLR4_4_1aakablpk36.R.inc(21);pawnClicked(finalI, finalJ);
                });
                __CLR4_4_1aakablpk36.R.inc(22);Panel8x8.add(panel, i, j);

                __CLR4_4_1aakablpk36.R.inc(23);ArrayforPanel[i][j] = panel;
                __CLR4_4_1aakablpk36.R.inc(24);if (((((i + j) % 2 == 0)&&(__CLR4_4_1aakablpk36.R.iget(25)!=0|true))||(__CLR4_4_1aakablpk36.R.iget(26)==0&false))) {{
                    __CLR4_4_1aakablpk36.R.inc(27);panel.setStyle("-fx-background-color:#fce2c4");
                } }else {{
                    __CLR4_4_1aakablpk36.R.inc(28);panel.setStyle("-fx-background-color:orange");
                }
                }__CLR4_4_1aakablpk36.R.inc(29);if ((((i == 6 && j == 7)&&(__CLR4_4_1aakablpk36.R.iget(30)!=0|true))||(__CLR4_4_1aakablpk36.R.iget(31)==0&false))) {{
                    __CLR4_4_1aakablpk36.R.inc(32);panel.setStyle("-fx-background-color:red");
                }
            }}
        }}
    }}finally{__CLR4_4_1aakablpk36.R.flushNeeded();}}

    public void initialize() {try{__CLR4_4_1aakablpk36.R.inc(33);
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
        __CLR4_4_1aakablpk36.R.inc(34);drawChessboard();
        __CLR4_4_1aakablpk36.R.inc(35);kinginstance.getKing().fitHeightProperty().bind(ArrayforPanel[0][0].widthProperty());
        __CLR4_4_1aakablpk36.R.inc(36);kinginstance.getKing().fitWidthProperty().bind(ArrayforPanel[0][0].widthProperty());
        __CLR4_4_1aakablpk36.R.inc(37);knightinstance.getKnight().fitWidthProperty().bind(ArrayforPanel[0][0].widthProperty());
        __CLR4_4_1aakablpk36.R.inc(38);knightinstance.getKnight().fitHeightProperty().bind(ArrayforPanel[0][0].widthProperty());
        //Set the initial position
        __CLR4_4_1aakablpk36.R.inc(39);SettheKing(kinginstance.getColumn(), kinginstance.getRow());
        __CLR4_4_1aakablpk36.R.inc(40);System.out.println("KING: Column " + kinginstance.getColumn() + " , row " + kinginstance.getRow());
        __CLR4_4_1aakablpk36.R.inc(41);SettheKnight(knightinstance.getColumn(), knightinstance.getRow());
        __CLR4_4_1aakablpk36.R.inc(42);System.out.println("KNIGHT: Column " + knightinstance.getColumn() + " , row " + knightinstance.getRow());

    }finally{__CLR4_4_1aakablpk36.R.flushNeeded();}}

    private void pawnClicked(int i, int j) {try{__CLR4_4_1aakablpk36.R.inc(43);
        __CLR4_4_1aakablpk36.R.inc(44);System.out.println("Clicked " + i + " " + j);
        __CLR4_4_1aakablpk36.R.inc(45);int prevkingcolumn = kinginstance.getColumn();
        __CLR4_4_1aakablpk36.R.inc(46);int prevkingrow = kinginstance.getRow();
        __CLR4_4_1aakablpk36.R.inc(47);int prevknightcolumn = knightinstance.getColumn();
        __CLR4_4_1aakablpk36.R.inc(48);int prevknightrow = knightinstance.getRow();
        __CLR4_4_1aakablpk36.R.inc(49);int oppcoulmn;
        __CLR4_4_1aakablpk36.R.inc(50);int opprow;
        __CLR4_4_1aakablpk36.R.inc(51);boolean continueable = false;

        __CLR4_4_1aakablpk36.R.inc(52);if ((((prevkingcolumn == i && prevkingrow == j)&&(__CLR4_4_1aakablpk36.R.iget(53)!=0|true))||(__CLR4_4_1aakablpk36.R.iget(54)==0&false))) {{
            __CLR4_4_1aakablpk36.R.inc(55);System.out.println("You clicked the prev king place!");
        }
        }__CLR4_4_1aakablpk36.R.inc(56);if ((((prevknightcolumn == i && prevknightrow == j)&&(__CLR4_4_1aakablpk36.R.iget(57)!=0|true))||(__CLR4_4_1aakablpk36.R.iget(58)==0&false))) {{
            __CLR4_4_1aakablpk36.R.inc(59);System.out.println("You clicked the prev knight place!");
        }
        }__CLR4_4_1aakablpk36.R.inc(60);int kingcol = kinginstance.getColumn();
        __CLR4_4_1aakablpk36.R.inc(61);System.out.println("NOW KING COLUMN " + kingcol);
        __CLR4_4_1aakablpk36.R.inc(62);int kingrw = kinginstance.getRow();
        __CLR4_4_1aakablpk36.R.inc(63);System.out.println("NOW KING ROW " + kingrw);
        __CLR4_4_1aakablpk36.R.inc(64);kinginstance.KingChange(kingcol, kingrw);

        __CLR4_4_1aakablpk36.R.inc(65);int knightcol = knightinstance.getColumn();
        __CLR4_4_1aakablpk36.R.inc(66);System.out.println("NOW KNIGHT COLUMN " + knightcol);
        __CLR4_4_1aakablpk36.R.inc(67);int knightrw = knightinstance.getRow();
        __CLR4_4_1aakablpk36.R.inc(68);System.out.println("NOW KNIGHT ROW " + knightrw);
        __CLR4_4_1aakablpk36.R.inc(69);knightinstance.KnightChange(knightcol, knightrw);

        __CLR4_4_1aakablpk36.R.inc(70);for (int x = 0; (((x < 8)&&(__CLR4_4_1aakablpk36.R.iget(71)!=0|true))||(__CLR4_4_1aakablpk36.R.iget(72)==0&false)); x++) {{
            __CLR4_4_1aakablpk36.R.inc(73);if ((((kingcol == i && kingrw == j)&&(__CLR4_4_1aakablpk36.R.iget(74)!=0|true))||(__CLR4_4_1aakablpk36.R.iget(75)==0&false))) {{
                __CLR4_4_1aakablpk36.R.inc(76);System.out.println("King row and column: " + i + " " + j);
                __CLR4_4_1aakablpk36.R.inc(77);System.out.println("King moveable column and row " + kinginstance.moveableList.get(x).column + " " + kinginstance.moveableList.get(x).row);
                __CLR4_4_1aakablpk36.R.inc(78);isKingSelected = true;
                __CLR4_4_1aakablpk36.R.inc(79);isKnightSelected = false;
                __CLR4_4_1aakablpk36.R.inc(80);for (int y = 0; (((y < kinginstance.moveableList.size())&&(__CLR4_4_1aakablpk36.R.iget(81)!=0|true))||(__CLR4_4_1aakablpk36.R.iget(82)==0&false)); y++)
                    {__CLR4_4_1aakablpk36.R.inc(83);ArrayforPanel[kinginstance.moveableList.get(x).column][kinginstance.moveableList.get(x).row].setStyle("-fx-background-color:red");
            }}
            }__CLR4_4_1aakablpk36.R.inc(84);if ((((isKingSelected == true)&&(__CLR4_4_1aakablpk36.R.iget(85)!=0|true))||(__CLR4_4_1aakablpk36.R.iget(86)==0&false))) {{
                __CLR4_4_1aakablpk36.R.inc(87);if ((((kinginstance.moveableList.get(x).column == i && kinginstance.moveableList.get(x).row == j)&&(__CLR4_4_1aakablpk36.R.iget(88)!=0|true))||(__CLR4_4_1aakablpk36.R.iget(89)==0&false))) {{
                    {
                        __CLR4_4_1aakablpk36.R.inc(90);KingDraw(i, j);
                        __CLR4_4_1aakablpk36.R.inc(91);Checker(i, j);
                    }
                }
            }} }else {__CLR4_4_1aakablpk36.R.inc(92);if ((((knightcol == i && knightrw == j)&&(__CLR4_4_1aakablpk36.R.iget(93)!=0|true))||(__CLR4_4_1aakablpk36.R.iget(94)==0&false))) {{
                __CLR4_4_1aakablpk36.R.inc(95);System.out.println("Knight Array column and row" + knightinstance.moveableList2.get(x).column + " " + knightinstance.moveableList2.get(x).row);
                __CLR4_4_1aakablpk36.R.inc(96);isKnightSelected = true;
                __CLR4_4_1aakablpk36.R.inc(97);isKingSelected = false;
                __CLR4_4_1aakablpk36.R.inc(98);for (int y = 0; (((y < knightinstance.moveableList2.size())&&(__CLR4_4_1aakablpk36.R.iget(99)!=0|true))||(__CLR4_4_1aakablpk36.R.iget(100)==0&false)); y++)
                    {__CLR4_4_1aakablpk36.R.inc(101);ArrayforPanel[knightinstance.moveableList2.get(y).column][knightinstance.moveableList2.get(y).row].setStyle("-fx-background-color:red");
            }}
            }}__CLR4_4_1aakablpk36.R.inc(102);if ((((isKnightSelected == true)&&(__CLR4_4_1aakablpk36.R.iget(103)!=0|true))||(__CLR4_4_1aakablpk36.R.iget(104)==0&false))) {{
                __CLR4_4_1aakablpk36.R.inc(105);if ((((knightinstance.moveableList2.get(x).column == i && knightinstance.moveableList2.get(x).row == j)&&(__CLR4_4_1aakablpk36.R.iget(106)!=0|true))||(__CLR4_4_1aakablpk36.R.iget(107)==0&false))) {{
                    {
                        __CLR4_4_1aakablpk36.R.inc(108);KnightDraw(i, j);
                        __CLR4_4_1aakablpk36.R.inc(109);Checker(i, j);
                    }
                }
            }}
        }}


    }}finally{__CLR4_4_1aakablpk36.R.flushNeeded();}}

    public void Checker(int i, int j) {try{__CLR4_4_1aakablpk36.R.inc(110);

        __CLR4_4_1aakablpk36.R.inc(111);if ((((i == 6 && j == 7)&&(__CLR4_4_1aakablpk36.R.iget(112)!=0|true))||(__CLR4_4_1aakablpk36.R.iget(113)==0&false))) {{
            __CLR4_4_1aakablpk36.R.inc(114);System.out.println("GOOOOOOOOOOOOOOOOOOOOOOAAAAAAAAAAAAAAAAAAAAAAAAAL!!!!!");
        }
    }}finally{__CLR4_4_1aakablpk36.R.flushNeeded();}}

    public void KingDraw(int i, int j) {try{__CLR4_4_1aakablpk36.R.inc(115);
        __CLR4_4_1aakablpk36.R.inc(116);kinginstance.setRow(j);
        __CLR4_4_1aakablpk36.R.inc(117);System.out.println("INSIDE OF KING ROW" + kinginstance.getRow());
        __CLR4_4_1aakablpk36.R.inc(118);kinginstance.setColumn(i);
        __CLR4_4_1aakablpk36.R.inc(119);System.out.println("INSIDE OF KING COLUMN" + kinginstance.getColumn());
        __CLR4_4_1aakablpk36.R.inc(120);SettheKing(i, j);
        __CLR4_4_1aakablpk36.R.inc(121);isKingSelected = false;
        __CLR4_4_1aakablpk36.R.inc(122);count++;
        __CLR4_4_1aakablpk36.R.inc(123);for (int z = 0; (((z < knightinstance.moveableList2.size())&&(__CLR4_4_1aakablpk36.R.iget(124)!=0|true))||(__CLR4_4_1aakablpk36.R.iget(125)==0&false)); z++) {{
            __CLR4_4_1aakablpk36.R.inc(126);if ((((i == knightinstance.moveableList2.get(z).column && j == knightinstance.moveableList2.get(z).row)&&(__CLR4_4_1aakablpk36.R.iget(127)!=0|true))||(__CLR4_4_1aakablpk36.R.iget(128)==0&false))) {{
                __CLR4_4_1aakablpk36.R.inc(129);System.out.println("We found this game can continue. GO ahead!");
            }
        }}
        }__CLR4_4_1aakablpk36.R.inc(130);for (int y = 0; (((y < kinginstance.moveableList.size())&&(__CLR4_4_1aakablpk36.R.iget(131)!=0|true))||(__CLR4_4_1aakablpk36.R.iget(132)==0&false)); y++) {{
            __CLR4_4_1aakablpk36.R.inc(133);i = kinginstance.moveableList.get(y).column;
            __CLR4_4_1aakablpk36.R.inc(134);j = kinginstance.moveableList.get(y).row;
            __CLR4_4_1aakablpk36.R.inc(135);if (((((i + j) % 2 == 0)&&(__CLR4_4_1aakablpk36.R.iget(136)!=0|true))||(__CLR4_4_1aakablpk36.R.iget(137)==0&false))) {{
                __CLR4_4_1aakablpk36.R.inc(138);ArrayforPanel[kinginstance.moveableList.get(y).column][kinginstance.moveableList.get(y).row].setStyle("-fx-background-color:#fce2c4");
            } }else {{
                __CLR4_4_1aakablpk36.R.inc(139);ArrayforPanel[kinginstance.moveableList.get(y).column][kinginstance.moveableList.get(y).row].setStyle("-fx-background-color:orange");
            }
        }}
    }}finally{__CLR4_4_1aakablpk36.R.flushNeeded();}}

    public void KnightDraw(int i, int j) {try{__CLR4_4_1aakablpk36.R.inc(140);

        __CLR4_4_1aakablpk36.R.inc(141);knightinstance.setRow(j);
        __CLR4_4_1aakablpk36.R.inc(142);System.out.println("INSIDE OF KNIGHT ROW" + knightinstance.getRow());
        __CLR4_4_1aakablpk36.R.inc(143);knightinstance.setColumn(i);
        __CLR4_4_1aakablpk36.R.inc(144);System.out.println("INSIDE OF KNIGHT COLUMN" + knightinstance.getColumn());
        __CLR4_4_1aakablpk36.R.inc(145);SettheKnight(i, j);
        __CLR4_4_1aakablpk36.R.inc(146);isKnightSelected = false;
        __CLR4_4_1aakablpk36.R.inc(147);count++;
        __CLR4_4_1aakablpk36.R.inc(148);for (int z = 0; (((z < kinginstance.moveableList.size())&&(__CLR4_4_1aakablpk36.R.iget(149)!=0|true))||(__CLR4_4_1aakablpk36.R.iget(150)==0&false)); z++) {{
            __CLR4_4_1aakablpk36.R.inc(151);if ((((i == kinginstance.moveableList.get(z).column && j == kinginstance.moveableList.get(z).row)&&(__CLR4_4_1aakablpk36.R.iget(152)!=0|true))||(__CLR4_4_1aakablpk36.R.iget(153)==0&false))) {{
                __CLR4_4_1aakablpk36.R.inc(154);System.out.println("We found this game can continue. GO ahead!");
            }
        }}


        }__CLR4_4_1aakablpk36.R.inc(155);for (int y = 0; (((y < knightinstance.moveableList2.size())&&(__CLR4_4_1aakablpk36.R.iget(156)!=0|true))||(__CLR4_4_1aakablpk36.R.iget(157)==0&false)); y++) {{
            __CLR4_4_1aakablpk36.R.inc(158);i = knightinstance.moveableList2.get(y).column;
            __CLR4_4_1aakablpk36.R.inc(159);j = knightinstance.moveableList2.get(y).row;
            __CLR4_4_1aakablpk36.R.inc(160);if (((((i + j) % 2 == 0)&&(__CLR4_4_1aakablpk36.R.iget(161)!=0|true))||(__CLR4_4_1aakablpk36.R.iget(162)==0&false))) {{
                __CLR4_4_1aakablpk36.R.inc(163);ArrayforPanel[knightinstance.moveableList2.get(y).column][knightinstance.moveableList2.get(y).row].setStyle("-fx-background-color:#fce2c4");
            } }else {{
                __CLR4_4_1aakablpk36.R.inc(164);ArrayforPanel[knightinstance.moveableList2.get(y).column][knightinstance.moveableList2.get(y).row].setStyle("-fx-background-color:orange");
            }
        }}
    }}finally{__CLR4_4_1aakablpk36.R.flushNeeded();}}


    public void SettheKing(int x, int y) {try{__CLR4_4_1aakablpk36.R.inc(165);
        __CLR4_4_1aakablpk36.R.inc(166);ArrayforPanel[x][y].getChildren().add(kinginstance.getKing());
    }finally{__CLR4_4_1aakablpk36.R.flushNeeded();}}

    public void SettheKnight(int x, int y) {try{__CLR4_4_1aakablpk36.R.inc(167);
        __CLR4_4_1aakablpk36.R.inc(168);ArrayforPanel[x][y].getChildren().add(knightinstance.getKnight());
    }finally{__CLR4_4_1aakablpk36.R.flushNeeded();}}
    public void start2(Stage primaryStage) throws Exception{try{__CLR4_4_1aakablpk36.R.inc(169);
        __CLR4_4_1aakablpk36.R.inc(170);Parent root = FXMLLoader.load(getClass().getResource("/result.fxml"));
        __CLR4_4_1aakablpk36.R.inc(171);primaryStage.setTitle("KING AND KNIGHT");
        __CLR4_4_1aakablpk36.R.inc(172);primaryStage.setResizable(false);
        __CLR4_4_1aakablpk36.R.inc(173);primaryStage.setScene(new Scene(root));
        __CLR4_4_1aakablpk36.R.inc(174);primaryStage.show();
    }finally{__CLR4_4_1aakablpk36.R.flushNeeded();}}

}

