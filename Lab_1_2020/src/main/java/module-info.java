module com.mycompany.lab_1_2020 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.lab_1_2020 to javafx.fxml;
    exports com.mycompany.lab_1_2020;
}
