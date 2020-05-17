/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package sample;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import result.GameResult;

import java.io.IOException;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;


public class ResultsController {public static class __CLR4_4_17f7fkablpk6k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0044\u003a\u005c\u005c\u30c7\u30b9\u30af\u30c8\u30c3\u30d7\u005c\u005c\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0020\u0045\u006e\u0067\u0069\u006e\u0065\u0072\u0072\u0069\u006e\u0067\u005c\u005c\u0063\u0068\u0065\u0073\u0073\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1589752697422L,8589935092L,282,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @FXML
    private TableView<GameResult> toptenTable;

    @FXML
    private TableColumn<GameResult, String> player;

    @FXML
    private TableColumn<GameResult, Integer> counts;

    @FXML
    private TableColumn<GameResult, Duration> duration;

    @FXML
    private TableColumn<GameResult, ZonedDateTime> created;


    public void back(ActionEvent actionEvent) throws IOException {try{__CLR4_4_17f7fkablpk6k.R.inc(267);

        __CLR4_4_17f7fkablpk6k.R.inc(268);Parent root = FXMLLoader.load(getClass().getResource("/launch.fxml"));
        __CLR4_4_17f7fkablpk6k.R.inc(269);Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        __CLR4_4_17f7fkablpk6k.R.inc(270);stage.setScene(new Scene(root));
        __CLR4_4_17f7fkablpk6k.R.inc(271);stage.show();
        //log.info("Loading launch scene.");
    }finally{__CLR4_4_17f7fkablpk6k.R.flushNeeded();}}


    @FXML
    public void initialize() {try{__CLR4_4_17f7fkablpk6k.R.inc(272);
        __CLR4_4_17f7fkablpk6k.R.inc(273);gameResultDao = GameResultDao.getInstance();

        __CLR4_4_17f7fkablpk6k.R.inc(274);List<GameResult> toptenList = gameResultDao.findBest(10);

        __CLR4_4_17f7fkablpk6k.R.inc(275);player.setCellValueFactory(new PropertyValueFactory<>("player"));
        __CLR4_4_17f7fkablpk6k.R.inc(276);counts.setCellValueFactory(new PropertyValueFactory<>("counts"));
        __CLR4_4_17f7fkablpk6k.R.inc(277);duration.setCellValueFactory(new PropertyValueFactory<>("duration"));
        __CLR4_4_17f7fkablpk6k.R.inc(278);created.setCellValueFactory(new PropertyValueFactory<>("created"));


        __CLR4_4_17f7fkablpk6k.R.inc(279);ObservableList<GameResult> observableResult = FXCollections.observableArrayList();
        __CLR4_4_17f7fkablpk6k.R.inc(280);observableResult.addAll(toptenList);

        __CLR4_4_17f7fkablpk6k.R.inc(281);toptenTable.setItems(observableResult);
    }finally{__CLR4_4_17f7fkablpk6k.R.flushNeeded();}}

}

