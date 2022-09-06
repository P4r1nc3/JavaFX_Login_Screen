module com.example.java_login {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_login to javafx.fxml;
    exports com.example.java_login;
}