module org.una.laboratorio {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens org.una.laboratorio1 to javafx.fxml;
    opens org.una.laboratorio1.Controllers to javafx.fxml;
    opens org.una.laboratorio1.dto;
    exports org.una.laboratorio1.dto;
    exports org.una.laboratorio1;
    exports org.una.laboratorio1.Controllers;
    requires com.google.gson;
    requires lombok;
}
