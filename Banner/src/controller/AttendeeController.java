package controller;

import java.io.File;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Window;
import javafx.stage.FileChooser.ExtensionFilter;
import model.DataBase;

public class AttendeeController {
	
	@FXML
    private ImageView image;

    @FXML
    private Label dataLabel;

    @FXML
    private TextField loadTextField;

    @FXML
    private TextField pTextField;

    @FXML
    private TextField sTextField;

    @FXML
    private AnchorPane paintPane;
    
    private DataBase organizer;

    @FXML
    void attendeePaint(ActionEvent event) {

    }
    
    /* This method conect uses a FileChoser to load the list of attendents to the event 
     */
    @FXML
    void fileLoaderOption(ActionEvent event) {
    	Window w = null;
    	FileChooser fileChooser = new FileChooser();
    	fileChooser.setTitle("Open Resource File");
    	fileChooser.setInitialDirectory(new File(System.getProperty("./data/AsistantsInfo.txt")));
    	 fileChooser.getExtensionFilters().addAll(
    	         new ExtensionFilter("Text Files", "*.txt"));
    	 File selectedFile = fileChooser.showOpenDialog(w );
    	 if (selectedFile != null && selectedFile.canRead()) {
    		 try {
				organizer.loadFile(selectedFile.getName());
			} catch (IOException e) {
			}
    	 }
    }

    @FXML
    void loadList(ActionEvent event) {

    }

    @FXML
    void paintParticipants(ActionEvent event) {

    }

    @FXML
    void searchAttendee(ActionEvent event) {

    }

    @FXML
    void searchParticipant(ActionEvent event) {

    }

	public void initialize() {
		organizer = new DataBase();
	}
	
}