module com.example.cineabc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cineabc to javafx.fxml;
    exports com.example.cineabc;
}