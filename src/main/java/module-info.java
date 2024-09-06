module com.example.assertequalsexercise {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.assertequalsexercise to javafx.fxml;
    exports com.example.assertequalsexercise;
}