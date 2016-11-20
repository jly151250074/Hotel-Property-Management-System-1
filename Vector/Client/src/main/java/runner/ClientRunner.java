package runner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import presentation.controller.sign.SignInControllerImpl;
import presentation.view.sign.signin.SignInControllerService;
import presentation.view.sign.signin.SignInHelper;

import java.io.IOException;

/**
 * @author Molloh
 * @version 2016/11/6
 * @description run client
 */
public class ClientRunner extends Application{
    private SignInControllerService signInController;
    private SignInHelper signInHelper;

    @Override
    public void start(Stage primaryStage) {
        signInController = new SignInControllerImpl();
        signInHelper = new SignInHelper(signInController);
        signInController.setView(signInHelper);

        try {
            Parent root = FXMLLoader.load(getClass().getResource("/presentation/view/sign/signin/Signin.fxml"));
            Scene scene = new Scene(root);

            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
