package presentation.view.login;
/**
 * @ author Molloh
 * @ version 2016/11/5
 * @ description Login view
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginView extends Application {

    private Stage primaryStage;
    private AnchorPane loginView;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("VECTOR");

        showLoginView();
    }

    /**
     * Shows the login view
     */
    public void showLoginView() {
        try {
            // Load login view
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(LoginView.class.getResource("LoginView.fxml"));
            loginView = loader.load();

            // Show the scene containing the login view;
            Scene scene = new Scene(loginView);
            primaryStage.setScene(scene);
            primaryStage.show();

            LoginViewController controller = loader.getController();
            controller.setLoginView(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Jump to register view
     */


}
