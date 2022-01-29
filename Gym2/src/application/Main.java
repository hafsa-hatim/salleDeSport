package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root =FXMLLoader.load(getClass().getResource("/Interfaces/Receptioniste.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setTitle("Gym & Fitness Center" );
            primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();// e contient les informations sur les exeptions declanchés & pour afficher l'erreur
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}