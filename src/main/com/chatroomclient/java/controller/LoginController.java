package main.com.chatroomclient.java.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import main.com.chatroomclient.java.Main;

public class LoginController {

    @FXML
    private Button loginBtn;

    @FXML
    private Button closeBtn;

    @FXML
    private TextField userName;

    @FXML
    private TextField password;

    @FXML
    private Label forget;

    @FXML
    private Label register;

    /** 登录按钮的系列操作 */
    public void loginBtnMouseClick(MouseEvent mouseEvent) {

    }

    public void loginBtnMouseEnter(MouseEvent mouseEvent) {
        loginBtn.setStyle("-fx-background-color: linear-gradient(to top, #48c6ef 0%, #6f86d6 100%)");
    }

    public void loginBtnMouseExit(MouseEvent mouseEvent) {
        loginBtn.setStyle("-fx-background-color: linear-gradient(to right, #4facfe 0%, #00f2fe 100%)");
    }

    public void loginBtnMousePress(MouseEvent mouseEvent) {
        loginBtn.setStyle("-fx-background-color: linear-gradient(to top, #30cfd0 0%, #330867 100%)");
    }

    public void loginBtnMouseRelease(MouseEvent mouseEvent) {
        loginBtn.setStyle("-fx-background-color: linear-gradient(to top, #48c6ef 0%, #6f86d6 100%)");
    }

    /** 关闭窗口按钮操作 */
    public void closeMouseClick(MouseEvent mouseEvent) {
        System.exit(0);
    }

    public void closeMouseEnter(MouseEvent mouseEvent) {
        closeBtn.setStyle("-fx-background-color: #99999999");
    }

    public void closeMouseExit(MouseEvent mouseEvent) {
        closeBtn.setStyle("-fx-background-color: #00000000");
    }

    public void loginPaneClick(MouseEvent mouseEvent) {

    }

    /** 忘记密码按钮操作 */
    public void forgetMouseEnter(MouseEvent mouseEvent) {
        forget.setTextFill(Color.web("#4facfe"));
        forget.setUnderline(true);
    }

    public void forgetMouseExit(MouseEvent mouseEvent) {
        forget.setTextFill(Color.web("#a1a1a1"));
        forget.setUnderline(false);
    }

    /** 注册账号按钮操作 */
    public void registerMouseEnter(MouseEvent mouseEvent) {
        register.setTextFill(Color.web("#4facfe"));
        register.setUnderline(true);
    }

    public void registerMouseExit(MouseEvent mouseEvent) {
        register.setTextFill(Color.web("#a1a1a1"));
        register.setUnderline(false);
    }

    public void registerMouseClick(MouseEvent mouseEvent) {

    }
}
