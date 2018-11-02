package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class controlador {

	Stage stage;
	AnchorPane mypane;

	public controlador() {

	}

	@FXML
	private void handleClose() {

		System.exit(0);
	}

	@FXML
	public void cambiarEscena() throws IOException {

		// añade la escena al stage y la titula
		stage.setScene(new Scene(mypane));

	}

	public void setStageAndMyPane(Stage stage, AnchorPane mypane2) {
		this.stage = stage;
		this.mypane = mypane2;
	}

}
