module com.qaisr {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.qaisr to javafx.fxml;
    exports com.qaisr;
}
