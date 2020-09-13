module com.mycompany.lab_1_2020 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.lab_1_2020.views to javafx.fxml;
    exports com.mycompany.lab_1_2020.controllers;
}
