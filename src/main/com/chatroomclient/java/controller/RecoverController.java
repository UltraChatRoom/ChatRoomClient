package main.com.chatroomclient.java.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import main.com.chatroomclient.java.Main;
import main.com.chatroomclient.java.common.constant.ApplicationConstant;

/**
 * @className: RecoverController
 * @program: ChatRoomClient
 * @description: //TODO 找回密码窗口控制层
 * @author: GirtSeanking
 * @create: 2020-11-18 10:26
 **/

public class RecoverController {

    @FXML
    private Label welcomeLabel;

    @FXML
    private Button closeBtn;

    @FXML
    private Button backBtn;

    @FXML
    private TextField loginName;

    @FXML
    private TextField securityQuestion;

    @FXML
    private TextField questionAnswer;

    @FXML
    private PasswordField newPassword;

    @FXML
    private PasswordField passwordAgain;

    /**
     * @Author GirtSeanking
     * @Description //TODO 找回密码窗口关闭
     * @Date 11:41
     * @Param [mouseEvent]
     * @return void
     **/
    public void closeBtnMouseClick(MouseEvent mouseEvent) {
        System.out.println("(♥◠‿◠)ﾉﾞ  MagicChat关闭成功   ლ(´ڡ`ლ)ﾞ  \n" + "o(*^＠^*)o 感谢您的使用！！！ O(∩_∩)O\n");
        System.exit(0);
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 窗口关闭按钮样式变化设置
     * @Date 11:42
     * @Param [mouseEvent]
     * @return void
     **/
    public void closeBtnMouseEnter(MouseEvent mouseEvent) {
        closeBtn.setStyle("-fx-background-color: #99999999");
    }
    public void closeBtnMouseExit(MouseEvent mouseEvent) {
        closeBtn.setStyle("-fx-background-color: #00000000");
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 窗口返回按钮点击事件响应
     * @Date 10:50
     * @Param [mouseEvent]
     * @return void
     **/
    public void backBtnMouseClick(MouseEvent mouseEvent) {
        Main.getRecoverStage().close();
        Main.getLoginStage().show();
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 窗口返回按钮样式变化设置
     * @Date 10:50
     * @Param [mouseEvent]
     * @return void
     **/
    public void backBtnMouseEnter(MouseEvent mouseEvent) {
        backBtn.setStyle("-fx-background-color: #99999999");
    }
    public void backBtnMouseExit(MouseEvent mouseEvent) {
        backBtn.setStyle("-fx-background-color: #00000000");
    }

    public void loginNameMouseClick(MouseEvent mouseEvent) {
//        if (loginName.getText().isEmpty()) {
//            welcomeLabel.setText("请输入您的账号");
//        } else if (loginName.getText().length() != SystemConstant.NEW_LOGIN_NAME_MAX_LENGTH) {
//
//        }
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 账号输入响应事件
     * @Date 14:19 
     * @Param [keyEvent]
     * @return void
     **/
    public void loginNameKeyRelease(KeyEvent keyEvent) {
        if (loginName.getText().isEmpty()) {
            welcomeLabel.setText("请输入您的账号");
        } else if (loginName.getText().length() == ApplicationConstant.LOGIN_NAME_MAX_LENGTH) {
            welcomeLabel.setText("请填写您密保问题的答案");
            securityQuestion.setVisible(true);
            questionAnswer.setVisible(true);
        }
    }

    public void questionAnswerKeyRelease(KeyEvent keyEvent) {
    }

    public void newPasswordKeyRelease(KeyEvent keyEvent) {
    }

    public void passwordAgainKeyRelease(KeyEvent keyEvent) {
    }
}