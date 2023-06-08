module com.example.semo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires javafx.media;

    opens com.example.semo to javafx.fxml;
    exports com.example.semo;
}