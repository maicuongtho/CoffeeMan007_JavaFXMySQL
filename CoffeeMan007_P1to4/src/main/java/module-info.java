module vn.edu.tinhoc123.CoffeeMan007 {
    requires javafx.controls;
    requires javafx.fxml;
	requires java.sql;

    opens vn.edu.tinhoc123.CoffeeMan007.controllers to javafx.fxml;
    exports vn.edu.tinhoc123.CoffeeMan007;
}
