module chess {
    requires javafx.controls;
    requires javafx.fxml;
    opens main to javafx.graphics;
    opens sample to javafx.fxml;
}