package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;

import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;


public class HomeController  implements Initializable {
	   private Parent fxml;
	   
	   
	   @FXML
	    private AnchorPane root;

	    @FXML
	    void Adherent(MouseEvent event) {
	    	try {
				fxml =FXMLLoader.load(getClass().getResource("/Interface/Adherent.fxml"));
				root.getChildren().removeAll();
				root.getChildren().setAll(fxml);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	    }

	    @FXML
	    void Coach(MouseEvent event) {

	    }

	    @FXML
	    void Cour(MouseEvent event) {

	    }

	    @FXML
	    void Reservation(MouseEvent event) {

	    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
