package vn.edu.tinhoc123.CoffeeMan007;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import vn.edu.tinhoc123.CoffeeMan007.models.entities.Employee;
import vn.edu.tinhoc123.CoffeeMan007.repositories.EmployeeRepository;
import vn.edu.tinhoc123.CoffeeMan007.repositories.EmployeeRepositoryImpl;
import vn.edu.tinhoc123.CoffeeMan007.services.EmployeeService;
import vn.edu.tinhoc123.CoffeeMan007.utils.DatabaseConnection;

import java.io.IOException;
import java.sql.Connection;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("fxml/employee"), 800, 600);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxmlPath) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxmlPath + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
//    	EmployeeService empSvc = new EmployeeService();
//    
//    	Employee nv1 = new Employee("Tran Van M", 
//    								"Chu quan", 3000, 
//    								"091330092", "quan@gmail.com",
//    								true,
//    								"mctho-moi", "9876543", 
//    								"9999999999");
//    	
//    	boolean themDuoc= empSvc.save(nv1);
//    	
//    	if (themDuoc) System.out.print("OK");
//    	else System.out.print("NOOOOOOOO OK");
    	 
    }

}