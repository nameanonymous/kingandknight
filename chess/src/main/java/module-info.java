module chess {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;
    opens main to javafx.graphics;
    opens sample to javafx.fxml;
}