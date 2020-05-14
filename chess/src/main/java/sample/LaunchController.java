package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.zip.CheckedOutputStream;

public class LaunchController {

    @FXML
    private TextField usernamefield;

    @FXML
    private Label errorLabel;

    public void startAction(ActionEvent actionEvent) throws IOException {
        if (usernamefield.getText().isEmpty()) {
            errorLabel.setText("* Username is empty!");
        } else {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        }

    }
}
