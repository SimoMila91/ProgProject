module com.example.progiii_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.progiii_project to javafx.fxml;
    exports com.example.progiii_project;
}