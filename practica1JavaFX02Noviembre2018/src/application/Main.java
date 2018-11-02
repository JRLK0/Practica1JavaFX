package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;



public class Main extends Application {
	
	private AnchorPane mypane;

	
	@Override
	public void start(Stage stage) throws IOException {

		// primero cargamos la vista fxml en el FXMLLoader
		FXMLLoader loader = new FXMLLoader(getClass().getResource(
				"ventanita.fxml"));

		// y opcionalmente un controlador para inicializar algún componente
		//loader.setController(new SetBlur());

		// ahora sobre el panel mypane cargamos la vista que dejamos en el
		// FXMLLoader
		mypane = (AnchorPane) loader.load();
		
		// añade la escena al stage y la titula
		stage.setTitle("Where's the squirrel?");
		stage.setScene(new Scene(mypane));
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
