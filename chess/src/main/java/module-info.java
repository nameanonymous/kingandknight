module chess {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;
    requires java.persistence;
    opens main to javafx.graphics;
    opens sample to javafx.fxml;
}