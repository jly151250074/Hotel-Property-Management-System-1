package presentation.view.member.memberMain;/**
 * @ author Molloh
 * @ version 2016/11/6
 * @ description
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MemberMainHelper implements Initializable {

    @FXML
    private Button signOut_btn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;

        if(event.getSource() == signOut_btn) {
            stage = (Stage)signOut_btn.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("/presentation/view/sign/signin/Signin.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

    }
}
