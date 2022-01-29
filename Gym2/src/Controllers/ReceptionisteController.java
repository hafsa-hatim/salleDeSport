
package Controllers;

import java.net.URL;
import java.util.EventObject;
import java.util.ResourceBundle;


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReceptionisteController implements Initializable {
	 @FXML
	    private TextField IdentifiantTextField;

	    @FXML
	    private Label LoginMessage;

	    @FXML
	    private PasswordField MotDePasseField;

	    @FXML
	    private Button OublieBotton;

	    @FXML
	    private Button SeconnecterBotton;
	    
	    @FXML
	    private AnchorPane Vbox;
	    private Parent fxml;
        
	    @FXML
	    void openHome() {
	    	String nom=IdentifiantTextField.getText();
	    	String pass=MotDePasseField.getText();
	    	if(nom.equals("Hiba.QOUIQA")&&pass.equals("yarbiykhdem")){
	    		System.out.println("connexion avec succé");
	    		Vbox.getScene().getWindow().hide();
	    		Stage home = new Stage();
	    		try {
					fxml= FXMLLoader.load(getClass().getResource("/Interfaces/Home.fxml"));
					Scene scene = new Scene(fxml);
					home.setScene(scene);
					home.show();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    		
	    	}else {
	    		System.out.println("mot de passe ou identifiant incorrect");
	    	}

	    }

	    @FXML
	    void sendPassword(ActionEvent event) {

	    }

		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			
		}
}