module com.example.demo.hello1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;


    opens com.example.demo.hello1 to javafx.fxml;
    exports com.example.demo.hello1;
}