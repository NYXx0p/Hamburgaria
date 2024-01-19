module com.school.sample {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.school.sample to javafx.fxml;
    exports com.school.sample;
}