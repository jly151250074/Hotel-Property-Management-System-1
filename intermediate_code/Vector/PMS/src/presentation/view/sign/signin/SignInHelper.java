package presentation.view.sign.signin;

import common.ResultMessage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author Molloh
 * @version 2016/11/5
 * @description SignInHelper for signin view
 */
public class SignInHelper implements Initializable {

    @FXML
    private Button signIn_btn;
    @FXML
    private Button signUp_btn;
    @FXML
    private TextField accout_field;
    @FXML
    private PasswordField password_field;

    @FXML
    private Label signInFailed_label;
    @FXML
    private AnchorPane thisPane;

    private Stage stage;
    private SignInControllerService controller;

    public SignInHelper(SignInControllerService controller) {
        this.controller = controller;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        accout_field.setText("输入用户名");
        password_field.setPromptText("Your password");
        signInFailed_label.setText("");

        //得到当前界面
        stage = (Stage)thisPane.getScene().getWindow();
    }

    public void setView(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/presentation/view/sign/signin/Signin.fxml"));
            Scene scene = new Scene(root);

            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        Parent root;
        String uiPath = null;
        //获取目标用户界面
        if(event.getSource() == signIn_btn) {
            ResultMessage userType = controller.signIn(accout_field.getText(), password_field.getText());
            switch(userType) {
                case SUCCEED:
                    uiPath = "/presentation/view/member/memberMain/MemberMain.fxml";
                    break;
                default:
                    break;
            }
        }else {
            uiPath = "/presentation/view/sign/signup/Signup.fxml";
        }

        //实现界面跳转
        if(uiPath != null) {
            root = FXMLLoader.load(getClass().getResource(uiPath));

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }else {
            signInFailed_label.setText("登录失败！");
        }

    }

}
