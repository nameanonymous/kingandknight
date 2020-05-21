module chess {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;
    requires java.persistence;
    requires org.apache.commons.lang3;
    opens main to javafx.graphics;
    opens sample to javafx.fxml;
}