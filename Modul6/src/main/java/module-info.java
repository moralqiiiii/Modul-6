module demo.modul6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens demo.modul6 to javafx.fxml;
    exports demo.modul6;
}