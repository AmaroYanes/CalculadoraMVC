package dad.mvc.calculadora;

import dad.mvc.calculadora.controller.CalculadoraController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculadoraApp extends Application {


	public void start(Stage primaryStage) throws Exception {

		CalculadoraController controller = new CalculadoraController();
		
		
		
		Scene scene = new Scene(controller.getView(),600,400);
		
		
		primaryStage.setTitle("Calculadora");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
