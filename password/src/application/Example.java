package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
 
public class Example {
    @FXML private Text actiontarget;
    
    @FXML protected void handleOKButton(ActionEvent event) {
        actiontarget.setText("bugaboo");
    }
    @FXML protected void handleHelpButton(ActionEvent event) {
        actiontarget.setText("Clicked");
    }
}